class OverloadMax
{
public static void main(String args[])
{
int a=12,b=20;
float c=2.5f,d=5.5f;
double e=7.99,f=84.55;
int g=max(a,b);
float h=max(c,d);
double i=max(e,f);
System.out.println("max of a,b is "+g);
System.out.println("max of c,d is "+h);
System.out.println("max of e,f is "+i);
}

static int max(int a,int b)
{
if(a>b)
return a;
else
return b;
}
static float max(float c,float d)
{
if(c>d)
return c;
else
return d;
}
static double max(double e,double f)
{
if(e>f)
return e;
else
return f;
}
}

