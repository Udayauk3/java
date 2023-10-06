import java.io.*;
public class FileInputDemo
{
public static void main(String [] args)
{
try 
{
FileInputStream fis = new FileInputStream("Biggest.txt");
FileInputStream fis1 = new FileInputStream("Biggest.txt");
FileOutputStream fos = new FileOutputStream("amulu.txt");
int n,p;
char c='h';
while((p=fis1.read())!=-1)
{
 System.out.print((char)p);
}

while((n=fis.read())!=-1)
{
 fos.write(n);
}
System.out.println("hi");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

