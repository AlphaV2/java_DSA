package Arrays_1;

import java.util.Scanner;
import java.util.Arrays;

public class Multidimensional {
    /**
     * @param args
     */
    public static void main(String[] args){
        // 2d Array
        /*2-d Array 
         * 1 2 3 
         * 4 5 6 
         * 6 7 8
         */
        Scanner read=new Scanner(System.in);
            // initialize
            int[][] arr=new int[3][3];

            // int [][] arr1={
            // {11,22,33},
            // {44,55,66},
            // {77,88,99}};

            //input for 2darrays 
            for (int row=0;row<arr.length;row++){
                for(int col=0; col < arr[row].length;col++){
                        arr[row][col]=read.nextInt();

                 }

                // 


            }
            // printing the values off the matrix
            for (int row=0;row<arr.length;row++){
                for(int col=0; col < arr[row].length;col++){
                        System.out.print(arr[row][col]+" ");

                 }
                 System.out.println();
            }

            // another way to print
        //      for (int row=0;row<arr.length;row++){
        //          System.out.println(Arrays.toString(arr[row]));
        // }
        // enhanced
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }





        read.close();
    }
    
}
 