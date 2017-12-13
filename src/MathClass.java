import java.util.Scanner;
import java.lang.Math;
public class MathClass {
    public static void main(String[] args) {
        double x = -9;
        System.out.println("Math.abs(" + x + ") = " + Math.abs(x));
    }

    public static int input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        return keyboard.nextInt();

    }
}




