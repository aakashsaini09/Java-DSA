package algos;
public class LeetCode {
    public static void main(String[] args) {
        int[] arr = {23, 3223, 234, 5, 423, 34, 434};
        int res = checkEvenNumbers(arr);
        System.out.println("Response is: " + res);
    }
    static int checkEvenNumbers(int[] arr){
        int count = 0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int val){
        int digits = digits(val);
        if(digits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int val){
        int count = 0;
        if(val < 0){
            val = val * 1;
        }
        if(val == 0){
            return 1;
        }
        while (val > 0) {
            val = val / 10;
            count++;
        }
        return count;
    }
}
