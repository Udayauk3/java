class ExceptionDemo
{
public static void main(String [] args )
{
try
{
int a=1,b=0;
int c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
System.out.println("\\\\\\\\\\");

System.out.println(e.getMessage());
System.out.println("\\\\\\\\\\\\\\\\\\");
e.printStackTrace();

}
finally
{
System.out.println("hi");
}
}
}