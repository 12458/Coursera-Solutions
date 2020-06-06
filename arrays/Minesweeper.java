public class Minesweeper {

    public static void main(String[] args) {
        // command-line arguments
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // to specify which cells contain mines
        boolean[][] mines = new boolean[m + 2][n + 2]; // by default is false

        // Place the k mines uniformly among the mn cells
        for (int z = 0; z < k; z++) {
            int i = 1 + (int) (Math.random() * (m));
            int j = 1 + (int) (Math.random() * (n));
            if (mines[i][j])
                k++;
            else
                mines[i][j] = true;
        }

        // Print the results.
        for (int i = 1; i < (m + 1); i++) {
            for (int j = 1; j < (n + 1); j++) {
                if (mines[i][j]) {
                    System.out.print("*  ");
                }
                if (!mines[i][j]) { // no mines
                    int num = 0;
                    if (mines[i + 1][j - 1])
                        num++;
                    if (mines[i + 1][j])
                        num++;
                    if (mines[i + 1][j + 1])
                        num++;
                    if (mines[i][j - 1])
                        num++;
                    if (mines[i][j + 1])
                        num++;
                    if (mines[i - 1][j - 1])
                        num++;
                    if (mines[i - 1][j])
                        num++;
                    if (mines[i - 1][j + 1])
                        num++;
                    System.out.print(num + "  ");
                }
            }
            System.out.println();
        }
    }
}
