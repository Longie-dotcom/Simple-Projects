public class RandomWalkers {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int trial = Integer.parseInt(args[1]);
        int x;
        int y;
        int step;
        int sum = 0;
        double possibility;
        for (int i = 0; i < trial; i++){
            step = 0;
            x = 0;
            y = 0;
            while ((Math.abs(x) + Math.abs(y)) != d){
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
                step++;
            };
            sum += step;
        };
        double average = (double) sum / (double) trial; 
        System.out.println("average number of steps = " + average);
    }    
}
