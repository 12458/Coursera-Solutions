public class RandomWalkers {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]); // r = Manhattan distance
        int trials = Integer.parseInt(args[1]); // the number of trials
        int exp = trials; // number of trials made so far
        double x = 0;
        double y = 0;
        double totalsteps = 0;
        int n = 0; // n = number of steps
        double direction = 0;

        while (exp > 0) {
            x = 0;
            y = 0;
            n = 0; // n = number of steps
            while ((Math.abs(x) + Math.abs(y)) < r) {
                direction = Math.random();
                if (direction > 0.25) {
                    if (direction > 0.50) {
                        if (direction > 0.75)
                            x++;
                        else
                            x--;
                    } else
                        y++;
                } else
                    y--;
                n = n + 1;
            }
            exp = exp - 1;
            totalsteps = totalsteps + n;
        }
        double average = totalsteps / trials;
        System.out.println("average number of steps = " + average);
    }

}
