public class RandomWalker {

    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]); // r = Manhattan distance
        int n = 0; // n = number of steps
        int x = 0;
        int y = 0;

        while ((Math.abs(x) + Math.abs(y)) < r) {
            System.out.println("(" + x + ", " + y + ")");
            double direction = Math.random();
            if (direction < 0.25) {
                // 0 <= direction < 0.25
                // North
                y++;

            } else if ((direction >= 0.25) && (direction < 0.50)) {
                // 0.25 <= direction < 0.50
                // East
                x++;
            } else if ((direction >= 0.50) && (direction < 0.75)) {
                // 0.50 <= direction < 0.75
                // South
                y--;
            } else {
                // 0.75 <= direction <= 1.00
                // West
                x--;
            }
            n++;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + n);

    }

}
