class Key
{
public static void main(String args[])
{
int max=0,key=0,i=1;
int input1=3521,input2=2452,input3=1352;
while(input1!=0 && input2!=0 &&input3!=0)
{
int d=input1%10;//1
int e=input2%10;//2
int f=input3%10;//2
if(d>=e && d>=f)
max=d;
else if(e>=d && e>=f)
max=e;
else
max=f;
key+=max*i;
input1=input1/10;
input2=input2/10;
input3=input3/10;
i=i*10;
}
System.out.println(key);
}
}




