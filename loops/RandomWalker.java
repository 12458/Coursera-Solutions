public class RandomWalker {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]); // r = Manhattan distance
        int n = 0; // n = number of steps
        int x = 0;
        int y = 0;

        while ((Math.abs(x) + Math.abs(y)) < r) {
            System.out.println("(" + x + ", " + y + ")");
            double direction = Math.random();
            if (direction > 0.25) {
                if (direction > 0.50) {
                    if (direction > 0.75) x += 1;
                    else x += -1;
                } else y += 1;
            } else y += -1;

            n += 1;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + n);

    }

}
