import java.util.*;
public class SumOfDigits
{
public static void main(String[] args)
{
int n,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter a 5 digit number");
n=sc.nextInt();
y=recursive(n);
System.out.println("sum of 5 digits is" +y);
}
static int recursive(int x)
{
int s,f;
if(x==0){
return(0);
}
else
f=x%10;
s=f+recursive(x/10);
return(s);
}
}