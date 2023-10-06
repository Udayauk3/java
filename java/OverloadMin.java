class OverloadMin
{
public static void main(String [] args )
{
int a=10,b=15,c=20;
int d=min(a,b);
int e=min(a,b,c,10,20,36);
int f=min(a,c);
int g=min(5,6,1,0,3,45,6,3,2);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
}
static int min(int... num)
{
int m=num[0];
for(int i=1;i<num.length;i++)
{
if(m>num[i])
{     
m=num[i];
}
}
return m;
}
}
                                   //m=10 m[1]=12  10>12