package algos;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println("Enter value: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\nValues of array: " + Arrays.toString(arr));
        // reverse array
        int[] temp = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            temp[j] = arr[i];
        }
        System.out.println("Reverse of array: " + Arrays.toString(temp));


        //  int[] temp = new int[arr.length + 1];
        // for(int i = arr.length - 1; i >= 0; i--){
        //     int var = 0;
        //     temp[var] = arr[i];
        //     var = (var + 1);
        //     temp[i] = arr[i]; 
        // }
        // System.out.println("Reverse array: " + Arrays.toString(temp));

        // Sorting the array
        // int[] temp = new int[arr.length - 1];
        // for(int i = 0; i <= arr.length; i++){
            
        // }
        // System.out.println("Sorted array: " + Arrays.toString(arr));
        
    }
}
