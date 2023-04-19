import java.util.*;

public class functions {
    public static int calculateSum(int a, int b) {
        int addition = a + b;
        return addition;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.print(sum);
    }
}
