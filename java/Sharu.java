class Sharu
{
public static void main(String args[])
{
String s="the good the bad and the ugly ";
int spaces=0;
int count=0;
int sum=0;
int l=s.length();
System.out.println(l);
for(int i=0;i<l-1;i++)
{
if(s.charAt(i)==' ')
spaces++;
}
count=l-spaces;
System.out.println(spaces);
System.out.println(count);
while(count!=0)
{
int n=count%10;
sum=sum+n;
count=count/10;
}
System.out.println(sum);
}
}