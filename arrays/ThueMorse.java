public class ThueMorse {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // Create a boolean array of length n
        int[] a = new int[n];

        // if n is a power of 2:
        for (int i = 1; i < n; i++) {
            // if i is zero:
            if (i == 0)
                a[i] = 0;
            // if i is even:
            else if (i % 2 == 0)
                a[i] = a[i / 2];
            // if i is odd:
            else
                a[i] = 1 - a[i - 1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    System.out.print("+  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
    }

}
