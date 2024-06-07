public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x){

        if (x == Double.POSITIVE_INFINITY){
            return 1;
        } else if (x > 0){
            return 1;
        } else if (x < 0){
            return 0;
        } else if (x == 0){
            return 0.5;
        } else if (x == Double.NEGATIVE_INFINITY){
            return 0.0;
        } else {
            return Double.NaN;
        }
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x){
        if ((1 + Math.pow(Math.E, -x)) == 0){
            return Double.NaN;
        } else {
            return 1 / (1 + Math.pow(Math.E, -x));
        }
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x){

        if (x == Double.POSITIVE_INFINITY || x == Double.MAX_VALUE){
            return 1.0;
        } else if (x == Double.NEGATIVE_INFINITY || x == -Double.MAX_VALUE){
            return -1.0;
        } else if ((Math.pow(Math.E, x) + Math.pow(Math.E, -x) == 0)){
            return Double.NaN;
        } else if (x == 0.0){
            return 0.0;
        } else{
            return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / (Math.pow(Math.E, x) + Math.pow(Math.E, -x));
        }
    }

    // Returns the softsign function of x.
    public static double softsign(double x){
        if (x == Double.POSITIVE_INFINITY){
            return 1.0;
        } else if (x == Double.NEGATIVE_INFINITY){
            return -1.0;
        } else if (x == 0.0){
            return 0.0;
        } else {
            return x / (1 + Math.abs(x));
        }
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x){
        if (x == Double.NaN){
            return Double.NaN;
        } else if (x <= -2){
            return -1.0;
        } else if (x > -2 && x < 0){
            return x + (x * x) / 4;
        } else if (x >= 0 && x < 2){
            return x - (x * x) / 4;
        } else if (x >= 2.0){
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        System.out.printf("%9s(%.1f) = %.1f%n", "heaviside", x, heaviside(x));
        System.out.printf("%9s(%.1f) = %s%n", "sigmoid", x, String.format("%.16f", sigmoid(x)).replaceAll("\\.?0*$", ""));
        System.out.printf("%9s(%.1f) = %s%n", "tanh", x, String.format("%.16f", tanh(x)).replaceAll("\\.?0*$", ""));
        System.out.printf("%9s(%.1f) = %s%n", "softsign", x, String.format("%.16f", softsign(x)).replaceAll("\\.?0*$", ""));
        System.out.printf("%9s(%.1f) = %s%n", "sqnl", x, String.format("%.16f", sqnl(x)).replaceAll("\\.?0*$", ""));
    }
}