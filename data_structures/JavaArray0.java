
// public class
public class JavaArray0{

    public static void main(String[] args) {
        
        //initialise array of size 10
        int[] arr=new int[10];

        //print base address of array
        System.out.println(arr);

        //Store value in array
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }

        //for loop help to iterate over array using index value 
        //condition that the index value should be in range from 0 to array.length-1
        //array.length is length property which gives length or size of the array

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //for-each loop help to iterate over array without using index value 
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}