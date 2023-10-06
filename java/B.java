package p1; 
  
class A 
{ 
private int display() 
    { 
        System.out.println("GeeksforGeeks"); 
	return 5;
    } 
} 
  
class B 
{ 
public static void main(String args[]) 
    { 
        A obj = new A(); 
        // Trying to access private method
        // of another class 
        int a=display(); 
	System.out.println(a);
    } 
} 