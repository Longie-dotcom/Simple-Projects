public class GreatCircle {
    public static void main(String[] args) {
        double a = Math.toRadians(Double.parseDouble(args[0]));
        double b = Math.toRadians(Double.parseDouble(args[1]));
        double c = Math.toRadians(Double.parseDouble(args[2]));
        double d = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6.371;
        double distance = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((a - c) / 2), 2)+ Math.cos(a) * Math.cos(c) * Math.pow(Math.sin((b - d) / 2), 2))) * 1000;
        System.out.println(distance + " kilometers");
    }
}
