import edu.princeton.cs.algs4.StdIn;

public class ShannonEntropy{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int k = 0;

        //input list
        int[] list = new int[100000000];
        while(!StdIn.isEmpty()){
            list[k] = StdIn.readInt();
            k++;
        }

        //count frequency and x
        int[] freq = new int[100000000];
        for (int i = 0; i < k; i++) {
            freq[list[i]]++;
        }

        //caculate
        double sum = 0;
        for (int i = 0; i <= N; i++){
            double a = (double) freq[i] / k;
            if (a != 0){
                sum -= a * (Math.log(a) / Math.log(2)) ;
            }
        }

        System.out.printf("%.4f",sum);
    }
}

// optimize this code: merge loops (input and count frequency)
/*
 *  int[] list = new int[100000000];
        while(!StdIn.isEmpty()){
            list[k] = StdIn.readInt();
            freq[list[k]]++;
            k++;
        }
 */