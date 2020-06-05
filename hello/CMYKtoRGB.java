// https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php
public class CMYKtoRGB {

    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]); // Cyan
        double m = Double.parseDouble(args[1]); // Magenta
        double y = Double.parseDouble(args[2]); // Yellow
        double k = Double.parseDouble(args[3]); // Black

        double white = 1 - k;
        double red = 255 * white * (1 - c);
        double green = 255 * white * (1 - m);
        double blue = 255 * white * (1 - y);

        System.out.println("red = " + (int) Math.round(red));
        System.out.println("green = " + (int) Math.round(green));
        System.out.println("blue = " + (int) Math.round(blue));
    }

}
