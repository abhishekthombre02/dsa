//Different ways of Declaration and Initialize  array in java

//import Arrays class from utility package
import java.util.Arrays;

public class JavaArray1 {
    
    public static void main(String[] args) {
        

        //[] after identifier and before =
        int arr0[]=new int[10];

        //[] after data type and before identifier
        int[] arr1= new int[5];
        
        //direct initialization without using new keyword
        int[] arr2= {1,2,3,4,5};
        System.out.println(arr2);

        //direct initialization using new keyword
        int[] arr3 = new int[]{1,2,3,4,5,6};
        System.out.println(arr2);

        //initialize array with default value
        int[] arr4= new int[10];
        //fill method from class Arrays helps to fill array with default value
        Arrays.fill(arr4,1);
        for(int i: arr4){
            System.out.print(i+" ");
        }

    }
}
