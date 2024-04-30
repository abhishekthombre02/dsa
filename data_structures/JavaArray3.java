
public class JavaArray3 {
    public static void main(String[] args) {
        
        int[] arr0=new int[10];

        //why should you not use for-each loop when we have to manipulate array
        for(int i: arr0){
            i=1;
            System.out.print(i+" ");
        }
        //Working of for-each loop is such that we are storing value of each element of
        //array in i variable and then using it in our logic but if we reassign the value of i
        //it means we are changing value of variable i not array element
        //we must need index to access the location and change the value

        //print array observe any changes happen
        for(int i: arr0){
            System.out.println(i+" ");
        }

    }
}
