import java.util.*;
public class SumOfNatural{ public static void main(String[] args)
{
int a=25;
int x=recursive(a);
System.out.println("sum of 25 natural numbers is" +x);
} 
static int recursive(int i)
{ 
int f;
if(i==0)
return 0;
else
{
f=i+recursive(i-1);
}
return(f);
}
}