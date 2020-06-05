public class BandMatrix {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int diag = 0;

        for (int i = 0; i < n; i++) { // i for vertical
            for (int j = 0; j < n; j++) { // j for horizontal
                if (Math.abs(j - diag) <= width)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
            diag++;
        }
    }

}
