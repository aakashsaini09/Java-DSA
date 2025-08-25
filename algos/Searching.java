package algos;
import java.util.Scanner;
public class Searching{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to search in array (between 1-10)");
        int val = sc.nextInt();
        int[] arr = new int[]{1, 3, 5, 6, 7, 8, 9};
        // linear search
        if(val > 10 || val < 0){
            System.out.println("Warning!! Please enter the value between 1-10");
        }else{
            boolean found = false;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == val){
                    System.out.println("Value exists: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Value does not exist in array.");
            }
        }
        // binary search
        int left = 0, right;
            right = arr.length - 1;
            boolean found = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == val) {
                    System.out.println("Value exists: " + arr[mid]);
                    found = true;
                    break;
                } else if (arr[mid] < val) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (!found) {
                System.out.println("Value does not exist in array.");
            }
        
    }
}