public class Birthday {

    public static void main(String[] args) {

        // input
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // number of times that exactly num people entered the room
        int[] same = new int[n + 2];

        // performs experiment trials times
        for (int t = 0; t < trials; t++) {
            // number of people that have entereed the room
            int num = 0;
            // to keep track of which birthdays have been encountered so far (per trial)
            boolean[] bdays = new boolean[n];
            while (true) {
                num++;
                // Choose a birthday for the next person, uniformly at random between 0 and n to
                // 1
                int days = (int) (Math.random() * n);
                if (bdays[days]) {
                    same[num] += 1;
                    break; // false by default, true if same bday
                }
                bdays[days] = true;
            }
        }
        int i = 1;

        while (true) {
            double total = 0;
            for (int k = 1; k <= i; k++) {
                total += same[k];
            }
            double percentage = total / (double) trials;
            System.out.println(i + "   " + same[i] + "   " + percentage);
            i++;
            if (percentage >= 0.5)
                break;
        }

        // Print results: Each row should contain:
        // 1. the count i (num),
        // 2. the number of times that exactly i people enter the room,
        // 3. the percentage of times that i or fewer people enter the room.
    }

}
