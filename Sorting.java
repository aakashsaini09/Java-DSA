

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println("Enter value: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("All the value of array: " + Arrays.toString(arr));
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
    }
}
