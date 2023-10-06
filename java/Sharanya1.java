class Sharanya1
{
public static void main(String args[]){
int sum=0;
int arr[]={7,6,8,16,12,3};
int l= arr.length;
int org[]=new int[l]; 
org[l-1]=arr[l-1];
for(int i=l-2;i>=0;i--)
{
org[i]=arr[i]-org[i+1];//i=4,9 i=3,
}
System.out.println(org[0]);
for(int i=0;i<l-1;i++)
{
sum=sum+org[i];//2,5,1,7,9,3,
}
System.out.println(sum);
}
}