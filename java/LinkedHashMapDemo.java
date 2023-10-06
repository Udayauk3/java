import java.util.*;
class LinkedHashMapDemo
{
public static void main(String [] args)
{
LinkedHashMap lm=new LinkedHashMap();
lm.put("12","red");
lm.put("123","green");
lm.put("342","maroon");
lm.put("8990","black");
lm.put("12","red");
lm.put("12","red");

System.out.println("the objects are"+lm);
System.out.println("the keys from lm object"+lm.keySet());

}
}

