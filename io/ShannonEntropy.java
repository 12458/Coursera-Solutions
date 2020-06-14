// javac-introcs MyProgram.java
// java-introcs  MyProgram
public class ShannonEntropy {
    public static void main(String[] args) {
        // sequence of n integers are between 1 and m
        int m = Integer.parseInt(args[0]);


        // compute frequencies
        // freq[i] = # times integer i appears
        int[] freq = new int[m + 1];
        int n = 0;
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            freq[value]++;
            n++;
        }

        // compute Shannon entropy
        double entropy = 0.0;
        for (int i = 1; i <= m; i++) {
            double p = 1.0 * freq[i] / n;
            if (freq[i] > 0)
                entropy -= p * Math.log(p) / Math.log(2);
        }

        // print results
        StdOut.printf("%.4f%n", entropy);
    }
}
