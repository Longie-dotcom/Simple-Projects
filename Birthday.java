public class Birthday{
    public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int trial = Integer.parseInt(args[1]);
    int count;
    int index = 0, sum = 0;
    int i = 0;
    int[] a = new int[1000];
    double percent = 0;
    
        while(true){
            count = 0;
            a[i] = (int) (Math.random() * n);
            for (int k = 0; k < trial; k++){
                a[i] = (int) (Math.random() * n);
                for (int j = 0; j < i; j++) {
                    if (a[j] == a[i]) {
                        count++;
                        break;
                    }
                }
            }
            i++;
            sum += count;
            percent = (double) sum / trial;
            index++;
            System.out.printf("%d\t%d\t%.5f\n", index, count, percent);
            if (percent >= 0.5){
                break;
            }
        }
    }
}