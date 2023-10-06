class StringMatch
{
public static void main(String args[])
{
String input1="uda_";
String input2="Fever:cad:uday:karthik:udat";
input1=input1.toLowerCase();
input2=input2.toLowerCase();
int count;
for(int i=0;i<input2.length();i++)
{
for(int j=0;j<input1.length();j++)
{
if(input1.charAt(j)==input2.charAt(i))
{
if(input1.charAt(j)=='_');
continue;
}
}
count=0;
int j=i;
while(count<=input1.length())
{
System.out.print(input2.toUpperCase().charAt(j++));
count++;
}
}
}
}

