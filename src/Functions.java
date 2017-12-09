import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        System.out.println("The sum is " + f(input()));
        System.out.println("The 10th power is " + power(input()));
        System.out.println("Square Root is " + root(input()));
        System.out.println("Absolute value = " + absolute(input()));
    }

    public static int f(int x) {
        return x + 2;
    }

    public static int power(int x) {
        return x * x * x * x * x * x * x * x * x * x;
    }

    public static double root(int x) {
        return Math.sqrt(x);
    }

    public static int absolute(int x) {
        return (x >= 0) ? x : (-1 * x);
    }

    public static int input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number = ");
        return keyboard.nextInt();
    }
}
