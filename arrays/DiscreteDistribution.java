public class DiscreteDistribution {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int cumulativeSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }
        for (int j = 0; j < n; j++) {
            cumulativeSum += Integer.parseInt(args[j + 1]);
        }

        for (int z = 0; z < m; z++) {
            int r = (int) (Math.random() * (cumulativeSum));
            int sum = 0;
            int num = -1;
            for (int i = 0; i < n && sum <= r; i++) {
                sum += a[i];
                num = i + 1;
            }
            System.out.print(num + " ");
        }

    }

}
