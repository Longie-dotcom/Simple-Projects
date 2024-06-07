import edu.princeton.cs.algs4.StdDraw;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double len = 0.5;
        StdDraw.setScale(0, n);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                    if ((i + j) % 2 == 0){
                        StdDraw.setPenColor(StdDraw.BLUE);
                    } else {
                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    }
                    StdDraw.filledSquare(len * (2 * i + 1), len * (2 * j + 1), len);
            }
        }
    }
}
