import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        fun(name);
        demo(12, 34, 43, 54, 456, 304);
        // System.out.println("Sum of two numbers: ");
    }
    static int fun(int a, int b){
        int sum = a + b;
        return sum;
    }
    static void fun(String str){
        System.out.println("Hello, " + str + ". \nHow are you doing?");
        // return sum;
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
        // return sum;
    }
}
