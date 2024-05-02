public class JavaString2 {

    public static void main(String[] args) {
        
        StringBuilder str= new StringBuilder();

        for(int i=97;i<=122;i++){
            str.appendCodePoint(i);
            str.append(' ');
        }
    
        System.out.println(str);

        System.out.println(str.charAt(10));

        str.deleteCharAt(10);
        System.out.println(str);

        str.insert(10,Character.toChars(102));
        System.out.println(str);

        System.out.println(str.getClass());
        
        // String str0=str;         //type mismatch
        String str1= str.toString();
        System.out.println(str1);

    }
}
