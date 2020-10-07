
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *link;
};
struct node* createNode(int data)
{
    struct node *nn=(struct node*)malloc(sizeof(struct node));
    nn->info=data;
    nn->link=NULL;
    return nn;
}
void insertAtBegining(struct node** head, int item)
{
    struct node* nn;
    nn=createNode(item);
    if((*head)==NULL)
    {
        (*head)=nn;
    }
    else{
        nn->link=(*head);
        (*head)=nn;
    }
}
void insertAtLast(struct node** head, int item)
{
    struct node* t,*nn;
    nn=createNode(item);
    t=*head;
    if(*head==NULL)
    {
        *head=nn;
        
    }
    else{
        while(t->link!=NULL)
        {
            t=t->link;
        }
        t->link=nn;
    }
}
void deleteAtBeginning(struct node** head)
{
    struct node *t;
    t=*head;
    *head=t->link;
    free(t);
    
}
void deleteAtEnd(struct node** head)
{
    struct node *t,*p;
    t=*head;
    while(t->link->link!=NULL)
    {
        t=t->link;
        
    }
    p=t->link;
    t->link=NULL;
    free(p);
}
void deleteAtPos(struct node** head, int pos)
{
    struct node *t,*p;
    int count=0;
    t=*head;
    while(t!=NULL)
    {
        t = t->link;
        count++;
    }
    if(count<pos)
    {
        printf("NOT VALID POSITION");
    }
    else{
        t=*head;
    for(int i=0;i<pos-2;i++)
    {
        t=t->link;
    }
        p=t->link;
        t->link=p->link;
        free(p);
    }
    
}
void reverse(struct node **head)
{
    struct node *c,*p=NULL,*n=NULL;
    c=*head;
    while(c!=NULL)
    {
        n=c->link;
        c->link=p;
        p=c;
        c=n;
        
    }
    *head=p;
}
void sort(struct node **head)
{
    int temp;
    struct node *t,*a,*b,*e;
    t=*head;
    a=*head;
    e=*head;
    b=a->link;
    while(t!=NULL)
    {
        t=t->link;
    }
    while(e->link!=NULL)
    {
        while(b!=t)
        {
            
            
            if(a->info>b->info)
            {
                temp=a->info;
                a->info=b->info;
                b->info=temp;
            }
            a=b;
            b=b->link;
    }
        t=b;
        a=*head;
        b=a->link;
        e=e->link;
    }
}
void display(struct node *p)
{
    while(p!=NULL)
    {
        printf("%d\n",p->info);
        p=p->link;
        
    }
}
int main()
{
    struct node *start;
    start=NULL;
    int i,j,d;
    printf("Enter no Of Elements");
    scanf("%d",&i);
    for(j=0;j<i;j++)
    {
        scanf("%d",&d);
        insertAtLast(&start, d);
    }
    sort(&start);
    display(start);
    return 0;
    
}
