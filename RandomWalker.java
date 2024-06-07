public class RandomWalker {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int count = 0;
        double possibility;
        while ((Math.abs(x) + Math.abs(y)) != d){
            System.out.println("(" + x + ", " + y + ")");
            possibility = Math.random();
            if (possibility < 0.25 && possibility >= 0){
                x += 1;
            } else if (possibility < 0.5 && possibility >= 0.25){
                y -= 1;
            } else if (possibility < 0.75 && possibility >= 0.5){
                x -= 1;
            } else if (possibility < 1 && possibility >= 0.75){
                y += 1;
            };
            count++;
        };
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + count);
    }
}
