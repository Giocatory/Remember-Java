public class Factorial_recursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(Factorial(number));  // 120
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) { return 1; }
        return Factorial(n - 1) * n;
    }
}