package Arrays_1;

import java.util.*;
import java.util.ArrayList;




public class ArrayListExample {
    public static void main(String[] args){
        // Scanner object 
        Scanner read=new Scanner(System.in);

    //syntax
    ArrayList<Integer> list = new ArrayList<>(10); 
    // list.add(67);
    // list.add(100);
    // list.add(627);
    // list.add(7322);
    // list.add(94);
    // list.add(6655);
    // // originAL LIST
    // System.out.println(list);

    // // contain method 
    // System.out.println(list.contains(67));
    // // set the objects 
    // list.set(0, 9999);

    // // removing the objects
    // list.remove(2);
         
    // System.out.println(list);

    // inputs to the list
    for(int i=0;i<5;i++){
    list.add(read.nextInt());
    // pass index here as the list[index ] method wont work    
     

    }
    for(int i=0;i<5;i++){
    System.out.println(list.get(i));
    }
    for(int a:list){
        System.out.print(a +" ");
    }

    

    




    
}
}
