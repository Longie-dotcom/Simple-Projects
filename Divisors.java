public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b){
        
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b){
        if (gcd(a, b) == 0){
            return 0;
        }

        long lcm = (Math.abs(a) * Math.abs(b)) / gcd(a, b);

        if (lcm > Integer.MAX_VALUE || lcm < Integer.MIN_VALUE){
            return 0;
        }
        return (int) lcm;
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b){
        if (gcd(a, b) == 1){
            return true;
        } else {
            return false;
        }
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n){
        int count = 0;
        
        if (n <= 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        for (int i = 1; i < n; i++){
            if (areRelativelyPrime(i, n)){
                count++;
            }
        }

        return count;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.printf("%s(%d, %d) = %d%n", "gcd", a, b, gcd(a, b));
        System.out.printf("%s(%d, %d) = %d%n", "lcm", a, b, lcm(a, b));
        System.out.printf("%s(%d, %d) = %b%n", "areRelativelyPrime", a, b, areRelativelyPrime(a, b));
        System.out.printf("%s(%d) = %d%n", "totient", a, totient(a));
        System.out.printf("%s(%d) = %d%n", "totient", b, totient(b));

    }
}