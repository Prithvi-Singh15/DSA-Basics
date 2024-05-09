public class TowerOfHanoie {
    static void problem(int n, char from, char to, char aux) {
        if (n == 0)
            return;
        problem(n - 1, from, to, aux);
        System.out.println("Move" + n + "from" + from + "to" + to);
        problem(n - 1, aux, to, from);
    }

    public static void main(String args[]) {
        problem(3, 'A', 'C', 'B');
    }

}
