// https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
public class RightTriangle {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean right;
        right = ((a > 0) && (b > 0)) && (c > 0);
        right = right && ((((a * a) + (b * b)) == (c * c)) || (((a * a) + (c * c)) == (b * b))
                || (((c * c) + (b * b)) == (a * a)));

        System.out.println(right);
    }

}
