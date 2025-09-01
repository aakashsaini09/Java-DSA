package algos;
import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // fun(name);
        // demo(12, 34, 43, 54, 456, 304);
        // System.out.println("Sum of two numbers: ");
        //    isPrime();
        
        // System.out.println("Check number's armstrong value: ");
        // int val = sc.nextInt();
        // int ans = armStrong(val);
        // System.out.println("Armstrong value: " + ans);;
    }
    static int armStrong(int n){
        int org = n;
        int ans = 0;
        while ( n > 0) {
            int temp = n % 10;
            n = n/10;
            ans += temp * temp * temp;
        }
        if(ans == org){
            return org;
        }
        return ans;
    }
    static int fun(int a, int b){
        int sum = a + b;
        return sum;
    }
    static void fun(String str){
        System.out.println("Hello, " + str + ". \nHow are you doing?");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void isPrime(){
        
         while (true) {
            System.out.println("Enter number: or x for exit ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n <= 1){
                System.out.println("Not prime!!!");
                break;
            }
            int c = 2;
            while (c * c <= n) {
                if(n % c == 0){
                    System.out.println("Not prime!!!");
                    break;
                }
                c++;
                System.out.println("Prime!!");
            }
            if(n == 'x' || n == 'X'){
                break;
            }
        }
    }
}
