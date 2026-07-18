
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] ages) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Arithmetic calculatour\n");

        System.out.println("Please enter first number: ");
        int first = input.nextInt();
        
        System.out.println("New please enter second Number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mult);
        System.out.println("Division is: " + div);
        System.out.println("Modulation is: " + mod);

    }

}
