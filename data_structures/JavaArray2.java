import java.util.Arrays;

public class JavaArray2 {
    
    public static void main(String[] args) {
        
        int[] arr0={1,2,3,4,5,6};
        System.out.println(arr0);


        //clone or copy the array into another array
        int[] arr1=arr0.clone();

        System.out.println(arr1);

        System.out.println("array length equals: "+(arr0.length==arr1.length));

        System.out.println(arr0);
        System.out.println(arr1);

        for(int i:arr0){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        //this check weather address is same or not
        System.out.println(arr0.equals(arr1));
        System.out.println(arr0.equals(arr0));

        //this check weather the values are same or not
        System.out.println(Arrays.equals(arr0, arr1));

        //class Arrays clone method give us benefit as copy till the length also copy in range
        int [] arr2=Arrays.copyOf(arr0,6);
        int [] arr3=Arrays.copyOfRange(arr0,1,4);

        System.out.println("array length equals: "+(arr0.length==arr2.length));
        System.out.println("array length equals: "+(arr0.length==arr3.length));

        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr3){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(Arrays.equals(arr0, arr2));
        System.out.println(Arrays.equals(arr0, arr3));
        
    }
}
