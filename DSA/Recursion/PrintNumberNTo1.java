public class PrintNumberNTo1 {
    public static void f(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        f(n - 1);
    }

    public static void f1(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        f1(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {
        int n = 10;
        f1(n);
    }
}
