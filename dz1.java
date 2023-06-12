
import java.util.Scanner;

public class dz1 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Enter natural number: ");
        if (!scn.hasNextInt()) {
            System.out.println("You entered wrong number!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("You should enter positive number only!!!");
            else {
                System.out.printf("The triangle number of %d is: %s! ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("The factorial of %d is: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}
