class Digits 
{
public static void main(String args[])
{
int a=12,sum=0,t;
while(a!=0)
{
t=a%10;
sum++;
a=a/10;
}
System.out.println(sum);
}
}
