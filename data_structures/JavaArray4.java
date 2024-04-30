import java.util.Arrays;

public class JavaArray4 {
    
    public static void main(String[] args) {

        int[] arr0=new int[10];

        //task: update value at even index places with index value.
        //using for loop and if statement
        for(int i=0;i<10;i++){
            if(i%2==0){
                arr0[i]=i;
            }
        }
        for(int i: arr0){
            System.out.print(i+" ");
        }

        System.out.println();
        //task: update value at odd index places with index value
        //using for loop only 
        
        for(int i=1;i<10;i=i+2){
            arr0[i]=i;
        }
        
        for(int i:arr0){
            System.out.print(i+" ");
        }

    }
}
