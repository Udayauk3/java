import java.util.*;
class Prime
{
public static void main(String args[])
{
int startNum,endNum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter low");
startNum=sc.nextInt();
System.out.println("Enter high");
endNum=sc.nextInt();
for(int i=startNum;i<=endNum;i++)
{
int fact=0;
for(int j=2;j<=i;j++)
{
if(i%j==0)
{
fact++;
}

}
if(fact<=1)
{
System.out.println(i);
}
}
}
}

////  1568
	7894	
	1832




