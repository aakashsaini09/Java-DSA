import java.util.Scanner;
import algos.Arith;
import algos.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for Arithmetic operations and 2 for other math operations.");
            int selection = sc.nextInt();
            if(selection == 1){
                System.out.println("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                Arith arithmetic = new Arith();
                System.out.println("Sum is: " + arithmetic.SumOfTwo(a, b));
                System.out.println("Minus is: " + arithmetic.MinusOfTwo(a, b));
                System.out.println("Division is: " + arithmetic.DivOfTwo(a, b));
                System.out.println("Multiplication is: " + arithmetic.MinusOfTwo(a, b));
            }else if(selection == 2){
                System.out.print("Enter One numbers: ");
                int a = sc.nextInt();
                Math mathFunctions = new Math();
                System.out.println("Square is: " + mathFunctions.SquareNumber(a));
                System.out.println("Multiplication is: " + mathFunctions.CubeOfNumber(a));
            }else{
                System.out.println("Exiting the loop");
                break;
            }
        }
    }
}