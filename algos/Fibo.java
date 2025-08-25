package algos;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the value of Fibonachi number: ");
        int val = inp.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= val) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Values: " + b);
    }
}
