class Add
{
int a=29; 
void sum()
{

System.out.println(a);

}
}
class Sub extends Add
{
 Sub()
{
System.out.println(a);
}
}


class Main1
{
public static void main(String [] args)
{
Sub obj=new Sub();
obj.sum();
}
}
