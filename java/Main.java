import java.util.*;
class Scanner1
{
Scanner1()
{
System.out.println("HI ");
}
void scan()
{
int i;
float j;
char c;
Scanner s1 = new Scanner(System.in);	
System.out.println("enter the value of i ");
i=s1.nextInt();
System.out.println("enter the value of j ");
j=s1.nextFloat();
System.out.println("enter the value of c ");
c=s1.next().charAt(0);
System.out.println(" value of is  "+i);
System.out.println("value of j is "+j);
System.out.println(" value of c is "+c);
}
}
class Main
{
public static void main(String[] args)
{
Scanner1 obj = new Scanner1();
obj.scan();
System.out.println("THANK YOU ");
}
}


