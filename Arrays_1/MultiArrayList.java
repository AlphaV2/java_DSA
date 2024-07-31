package Arrays_1;

import java.util.*;

public class MultiArrayList {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);

        // multi-dimensional array
       ArrayList< ArrayList<Integer>> list=new ArrayList<>();
    //     initialise array null values
    for (int i=0;i<3;i++){
        list.add(new ArrayList<>());
    }
    // add elements 
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(read.nextInt());
            }
        }

        System.out.println(list);

        // Close the scanner
        read.close();

    
    }

    
}
