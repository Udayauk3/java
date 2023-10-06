import java.io.*;
 
class GFG {
 
    // Declared Instance Variable
    public String geek;
    public int j;	
    public int i;
    public Integer I;
    public GFG()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Shubham Jain";
	System.out.println("hi");
    }
 
    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        GFG name = new GFG();
 
        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "
                           + name.i);
	}
}
