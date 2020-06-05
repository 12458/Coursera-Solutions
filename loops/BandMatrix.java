public class BandMatrix {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int diag = 0;

        for (int temp = n; temp > 0; temp--) {
            for (int h = 0; h < n; h++) { // h for horizontal
                if (Math.abs(h - diag) <= width)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
            diag += 1;
        }
    }

}
