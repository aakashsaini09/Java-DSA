package algos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("hello");
        ArrayList<Integer> listofarray = new ArrayList<>(10);
        // for(int i = 0; i <= 5; i++){
        //    listofarray.add(inp.nextInt());
        // }
        // System.out.println(listofarray);
        // System.out.println("Changing and removing the array elements: ");
        // listofarray.set(0, 39);
        // listofarray.remove(1);
        // System.out.println(listofarray);
        int[] arr = {11, 12, 13, 14, 15, 16, 332, 23, 32,122, 4};
        // swap(arr, 0, 4);
        // System.out.println("Swap array is: " + Arrays.toString(arr));
        int val = max(arr);
        System.out.println("Max value in array: " + val);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int indx1, int indx2) {
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static int max(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }

}
