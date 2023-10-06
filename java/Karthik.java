import java.util.*;
class Karthik
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int count=0;
int input2=input1;
while(input2!=0)
{
int n=input2%10;
count++;
input2=input2/10;
}



int arr[]=new int[count+1];
	System.out.println(arr.length);

        int sum=0;
	int i=arr.length-2;
        while(input1!=0)
        {
            int n=input1%10;
            arr[i]=n;
            input1=input1/10;
            i--;

        }
for(int u:arr)
	System.out.println(u);
        arr[arr.length-1]=0;
        for(int j=0;j<arr.length-2;j++)
        {
        
        sum=sum+arr[j]*arr[j+1];
        }
        System.out.println(sum);

            

            

        
	}
}