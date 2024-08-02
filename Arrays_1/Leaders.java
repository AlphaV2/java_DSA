package Arrays_1;
import java.util.*;

public class Leaders {
    // main method 
    public static void main(String[] args){
        int array[]={16,17,4,3,5,2};
        leader(array);
        }

    // leader method 
     static void leader(int arr[]){
        int max=arr[arr.length-1];
        System.out.print(max+ " ");

        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.print(max+" ");

            }

        }

   
        




    }





    }
    

