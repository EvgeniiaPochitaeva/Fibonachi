package fibonachi;

public class FibonachiRecurs {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
//Просторова складність: O(n) (Для кожного виклику функції створюється новий стек для
// зберігання локальних змінних і повертається значення).

//Часова складність:  O(2^n) (для кожного значення n викликається дві рекурсії).