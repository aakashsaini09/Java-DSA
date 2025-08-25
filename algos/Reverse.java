package algos;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value you want to reverse: ");
        int value = input.nextInt();    // 253558
        int ans = 0;    
        while (value > 0) {
            int temp = value % 10;
            ans = ans * 10 + temp;
            value = value / 10;
        }
        System.out.println("Answer is: " + ans);
    }
}
