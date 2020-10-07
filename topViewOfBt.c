
#include <stdio.h>
#include<stdlib.h>
int r[50];
int ar[100];
typedef struct trees
{
    int data;
    struct trees* left;
    struct trees* right;
    int hd;
}tree;


int isEmpty(que q) {
    if(q.front == -1 && q.rear == -1)
        return 1;
    else
        return 0;
}

tree* create(int d, int h)
{
    tree* root = (tree*) malloc (sizeof(tree));
    root->data = d;
    root->hd = h;
    root->left = root->right = NULL;
    return root;
}

tree* createTree(tree* root, int d, int h) {
    if(root == NULL) {
        return create(d, h);
    }
    if (d > root->data)
        root->right = createTree(root->right, d, h+1);
    else if (d < root->data)
        root->left = createTree(root->left, d, h-1);
    return root;
}

int max(int a, int b)
{
    if(a>b) return a;
    return b;
}
int height(tree* root)
{
    if(root == NULL) return 0;
    return 1 + max(height(root->left),height(root->right));
}
void tv(tree* root, int i)
{
    if(i == 0) return ;
    r[12 + root->hd] = root->data;
    tv(root->left, i-1);
    tv(root->right, i-1);
    
}

int main()
{
    int i;
    int l, r;
    l = r = 50;
    tree* root = NULL;
    int a[] = {5, 1, 6, 2, 3, 4};
    for(i = 0; i < 6; i++)
        root = createTree(root, a[i], 0);
    int h = height(root);
    for(i=1;i<=h;i++)
    {
        tv(root, i);
    }
    for(i = 0; i <= 100; i++)
        if(r[i]!= 0) printf("%d ", r[i]);
    return 0;
}
