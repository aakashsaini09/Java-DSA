public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 5, 9, 11, 16, 19, 22, 26, 37, 40};
        // int ans = orderAgnosticBS(arr, 26);
        int[] arr = {70, 66, 62, 51, 47, 44, 30, 28, 26, 20, 14, 9, 3};
        int ans = binarySearch(arr, 20);
        System.out.println("Ans: " + ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                start = mid + 1;
            }else if(target > arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}