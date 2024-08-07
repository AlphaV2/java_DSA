package Arrays_1;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args){

        int[]  array= {2,4,6,8,0,34};

        // swap(array,0,3);

        
        // System.out.println(Arrays.toString(array));

        // call array reversal 
        reverse(array);
        System.out.println(Arrays.toString(array));

    
    }

    // Swap method 
    static void swap(int[] arr ,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    // reversal of the array 
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<end;i++){
            swap(arr, start, end);
            System.err.println(arr[i]);
            start++;
            end--;


        }

        while(start<end){
            swap(arr, start, end);
            start++;
            end++;


        }
    
    }





