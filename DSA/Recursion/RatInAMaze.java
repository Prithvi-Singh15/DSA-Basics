public class RatInAMaze {
    public static boolean Rat(int a[][], boolean vis[][], int i, int j) {
        if (i == a.length || j == a.length || a[i][j] == 0 || vis[i][j]) {
            return false;
        }
        if (i == a.length - 1 && j == a.length - 1)
            return true;

        vis[i][j] = true;
        if (Rat(a, vis, i + 1, j))
            return true;
        if (Rat(a, vis, i, j + 1))
            return true;
        vis[i][j] = false;
        return false;
    }

    public static void main(String args[]) {
        int a[][] = {
                { 1, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 1, 0 },
                { 1, 1, 1, 1 },

        };
        boolean vis[][] = new boolean[a.length][a.length];
        boolean IsPathPossible = Rat(a, vis, 0, 0);
        System.out.println(IsPathPossible);

    }

}
