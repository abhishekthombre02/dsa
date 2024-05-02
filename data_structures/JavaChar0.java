
public class JavaChar0 {

    public static void main(String[] args) {
        
        char c1='a';
        System.out.println(c1);
        char c2='b';

        //character to string gives ascii value
        int value='a';
        System.out.println(value);

        int add= c1+c2;
        System.out.println(add);

        // concatinate of character is can not be performed as it is evaluated as exression
        // String s=c+a;   
        //We can not cast from char to string also from int to String
        //String s=(String)c;

        //we can convert char into String using Character class method toString()
        String n= Character.toString(c1);
        System.out.println(n);

        char[] ch={'a','1','b','h'};
        System.out.println(ch);
        System.out.println(ch[2]);

        //difference between isAlphabetic and isLetter is argument type both give same result
        //isAlphabetic takes codePoint value as argument
        //isLetter takes both character and codepoint  as argument
        boolean flag= Character.isAlphabetic(96);
        boolean flag1=Character.isLetter('a');

        boolean flag2=Character.isDigit('1');
        boolean flag3=Character.isDigit(97);

        boolean flag4=Character.isLetterOrDigit('1');
        boolean flag5=Character.isLetterOrDigit('a');

        boolean flag6=Character.isWhitespace(' ');
        boolean flag7=Character.isLowerCase('a');
        boolean flag8=Character.isUpperCase('A');
       
    
        
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);

    }
}
