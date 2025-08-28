package algos;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            // System.out.println("Operator: " + op);
            if(op == '*' || op == '/' || op == '%' || op == '+' || op == '-'){
                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                // Calculation here
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Please enter the valid operator");
            }
            System.out.println("Answer is: " + ans);
        }
    }
}
