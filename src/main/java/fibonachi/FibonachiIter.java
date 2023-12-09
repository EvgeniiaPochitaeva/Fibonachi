package fibonachi;

public class FibonachiIter {
    public static long fibonacci(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }

    public static void main(String[] args) {
        int n = 6;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
//Просторова складність: O(1) (константна, тому що використовується фіксована кількість змінних,
// які не залежать від розміру вхідних даних).

//Часова складність: O(n) (лінійна, оскільки цикл виконується n-1 раз).
