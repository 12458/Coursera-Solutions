public class GeneralizedHarmonic {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double h = 0;

        for (int x = 1; x <= n; x++) {
            h += (1 / Math.pow(x, r));
        }
        System.out.println(h);
    }

}
