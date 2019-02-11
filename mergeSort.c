#include<stdio.h>
#inlcude<stdlib.h>
void mergeSort(int *a, int *aux, int start, int end)
{
    if(start >= end) return;
    int mid = start + (end-start) / 2;
    mergeSort(a, aux, start, mid);
    mergeSort(a, aux, mid+1, end);
    merge(a, aux, start, mid, end);
}
void merge(int *a, int *aux, int start, int mid, int end)
{
    int i = start;
    int j = mid + 1;
    for(int k=start;k<=end;k++)
    {
        if(i > mid) aux[k] = a[j++];
        else if(j > end) aux[k] = a[i++];
        else if(a[i] > a[j]) aux[k] = a[j++];
        else aux[k] = a[i++];
    }
    for(int p=start;p<end;p++)
    {
        a[start]=aux[start];
    }
}
void print(int *a, int t)
{
    for(int i=0;i<t;i++)
    {
        printf("%d\n",a[i]);
    }
}
       

            
     
int main()
{
    int t;
    printf("Enter no of elements");
    scanf("%d",&t);
    int *a=(int*)malloc(sizeof(int)*t);
    int *aux=(int*)malloc(sizeof(int)*t);
    mergeSort(a, aux, 0, t);
    print(a, t);
}
