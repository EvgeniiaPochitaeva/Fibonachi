package fibonachi;

import java.util.HashMap;
import java.util.Map;

public class FibonachiDynamic {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}

//Просторова складність: O(n) (Для кожного виклику функції створюється новий стек для
// зберігання локальних змінних і повертається значення).

//Часова складність:  O(n) (лінійна, оскільки цикл виконується n-1 раз).