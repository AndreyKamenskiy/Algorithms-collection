import java.util.Scanner;

public class Main {

    static StringBuilder s = new StringBuilder("");

    public static double pow(double a, long n) {
        double res = 1;
        if (n == 0) {
            System.out.print(s + "1 = ");
            return 1;
        }
        if (n % 2 == 0) {
            System.out.print("= "+s+"(" + a+" * " + a + ") ^ " + n/2 + " = \n");
            return pow(a * a, n/2);
        }
        s.append(a + " * ");
        System.out.print("= " + s + a + " ^ " + (n-1) + " = \n");
        res = a * pow( a, n-1);

        return res;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.print(a + " ^ " + n);

        System.out.println(pow(a, n));
    }
}
