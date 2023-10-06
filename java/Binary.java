class Binary
{
public static void main(String args[])
{
int n=88,bin,i=0;
int a[]=new int[8];
while(n!=0)
{
bin=n%2;
n=n/2;
a[i]=bin;
i++;
}
for(int c=a.length-1;c>=0;c--)
System.out.print(a[c]);
}
}

