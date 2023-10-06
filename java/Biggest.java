import java.util.*;
class Biggest 
{
public static void main(String [] args)
{
int a=10,b=20,c=12;
Scanner s = new Scanner(System.in);
System.out.println("enter a value");
a=s.nextInt();
System.out.println("enter b value");
b=s.nextInt();
System.out.println("enter c value");
c=s.nextInt();
if(a>b && a>c)
System.out.println("a is greatest");
else if(b>a && b>c)
System.out.println("b is greatest");
else
System.out.println("c is greatest");
}
}






