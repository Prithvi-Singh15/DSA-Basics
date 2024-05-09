public class PrintNameNTimes {
    public static void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("prithvi");
        f(i + 1, n);
    }

    public static void main(String args[]) {
        int n = 10;
        f(1, n);

    }
}