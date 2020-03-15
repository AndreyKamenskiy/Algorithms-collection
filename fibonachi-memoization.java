import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Long, Long> memoize = new HashMap<>();

    public static long fib(long n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memoize.containsKey(n)) return memoize.get(n);
        long n1, n2;
        if (!memoize.containsKey(n - 1)) {
            memoize.put(n-1, fib(n - 1));
        }
        if (!memoize.containsKey(n - 2)) {
            memoize.put(n-2, fib(n - 2));
        }
        n1 = Math.abs(memoize.get(n - 1));
        n2 = Math.abs(memoize.get(n - 2));
        return (n1 + n2) * (n % 2 == 0 ? -1 : 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
