package Arrays_1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // array of primitives data types such as INT,BOOL,FLOAt,DOUBLE
        int[] arr = new int[5];// initialising the array of int data type
        // or use this synatx int[] array1={1,2,3,4,5,6}
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        // taking user inputs
        // System.out.println(arr[3]);
        // for(int i=0; i<5;i++){
        // arr[i]=read.nextInt();
        // }
        // printing the elements of the arrrya using Array methods
        // System.out.println(Arrays.toString(arr));
        // printing the elemnts using regular for loop
        // // for (int i=0;i<5;i++){
        // // System.out.print(arr[i]);

        // }
        // printing the elements using for each loop
        // for (int z:arr){
        // System.out.println(z);
        // }

        // Arrays of objects
        String[] names = new String[4];
        // inputs from user
        for (int i = 0; i < names.length; i++) {
            names[i] = read.next();

        }

        // one way of printing using for each loop
        for (String id : names) {
            System.out.println(id);

        }

        // Using array method to print elements
        System.out.println(Arrays.toString(names));
        // printing the elements using regular for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        // 2 Dimensional Arrays
        names[0] = "Hemal";
        System.out.println(names[0]);

    }

	public static char[] toString(int[] is) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'toString'");
	}

    public static char[] toString(int[][] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
