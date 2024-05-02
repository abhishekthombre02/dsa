import java.util.Arrays;

public class JavaArray5 {
    
    public static void main(String[] args) {
        
        int[] arr0= new int[]{10,40,50,20,30};

        //search element 50 and print it's index position
        //binary search only prefer when array is sorted

        for(int i:arr0){
            System.out.print(i+" ");
        }

        System.out.println();

        Arrays.sort(arr0);
        
        //sort method from class Arrays doesn't return anything it manipulate original array
        for(int i: arr0){
            System.out.print(i+" ");
        }
        System.out.println();

       int index= Arrays.binarySearch(arr0, 30);
       System.out.println(index);

       //converting  array into string is not that much useful
       String nums=Arrays.toString(arr0);

       System.out.println(nums);
       System.out.println(nums.charAt(0));

       char ch[]={'a','b','h','i'};
       System.out.println(ch);

       //if you want to convert character array to string then use String.valueOf() method
       String str1=String.valueOf(ch);
       System.out.println(str1);
       System.out.println(String.valueOf(ch));

       String name=Arrays.toString(ch);
       System.out.println(name);

    }
}
