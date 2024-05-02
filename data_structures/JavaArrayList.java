import java.util.List;
import java.util.ArrayList;

public class JavaArrayList {
    
    public static void main(String[] args) {
        
        //We can have only one data type inside <>
        List<Integer> list= new ArrayList();

        //size() method
        System.out.println(list.size());
        //add element

        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        
        //index of method to search index of number
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(11));

        System.out.println(list.get(8));

        System.out.println(list.contains(10));      //true
        System.out.println(list.isEmpty());            //false
        System.out.println(list.removeAll(list));   //true
        System.out.println(list.isEmpty());         //true

        
    }
}
