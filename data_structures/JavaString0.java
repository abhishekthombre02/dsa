// This is string literal. When you declare string like this, you are actually calling 
// intern() method on String. This method references internal pool of string objects. If 
// there already exists a string value “GeeksForGeeks”, then str will reference of that 
// string and no new String object will be created. Please refer Initialize and Compare 
// Strings in Java for details.

// This is string object. In this method JVM is forced to create a new string reference, 
// even if “GeeksForGeeks” is in the reference pool.
// Therefore, if we compare performance of string literal and string object, string object 
// will always take more time to execute than string literal because it will construct a new string every time it is executed.
// Note: Execution time is compiler dependent.


public class JavaString0 {
    
    static void printHello( String s ){
        System.out.println(s);
    }
    public static void main(String[] args) {
        
        //String Literal
        String s="Hello Java";      
        System.out.println(s);                              //output:Hello Java

        //String object
        String name1= new String("abhishek");
        System.out.println(name1);                          //output: abhishek

        //String object without initialization
        String name2= new String();
        System.out.println(name2);          //output: ""

        name2="thombre";
        System.out.println(name2);          //output: thombre

        printHello(new String("Hello"));    //passing dummy object String
        printHello("Hello Java");                   //passing string   
        
        String fname="abhishek";
        String lname="thombre";
        String fullName=fname+" "+lname;
        System.out.println(fullName);


    }
}
