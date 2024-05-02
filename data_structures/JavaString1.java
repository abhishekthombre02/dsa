
public class JavaString1 {
    
    public static void main(String[] args) {
        
        String str1=" We are happy ";
        String str2=" family";

        //length of the string
        System.out.println(str1.length());

        //charAt(index)
        System.out.println(str1.charAt(2));

        //substring method
        System.out.println(str1.substring(0,5));

        //concat method
        System.out.println("They said "+str1+str2);
        System.out.println(str1.concat(str2));

        //contains method
        System.out.println(str1.contains("happy"));
        
        //equals
        System.out.println(str2.equalsIgnoreCase("Happy"));

        //empty string
        System.out.println("".isEmpty());

        //index of char
        System.out.println(str1.indexOf(Character.toUpperCase('w')));

        //index of string
        System.out.println(str1.indexOf("happy"));

        //split string using regular expression
        String[] arr=str1.split(" ",5);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
