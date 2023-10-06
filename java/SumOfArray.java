class SumOfArray
{
public static void main(String args[])
{
int a[]={1,-4,3,2,-1,0};
int pos_sum=0,neg_sum=0;
for(int i=0;i<a.length;i++)
{
if(a[i]+a[i]>=0)
pos_sum++;
else
neg_sum++;
}
System.out.println(pos_sum+" "+neg_sum);
}
}
