public class DiscreteDistribution {
    public static void main(String[] args) {
     // input
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        };

    // process
        //Array of cumulative sums
        int[] s;
        s = new int[a.length];
        s[0] = 0;
        for (int i = 1; i < s.length; i++){
            s[i] = a[i] + s[i - 1];
        };

        //Array of indices
        int[] r = new int[a[0]]; //a[0] length of indice array
        boolean found;
        int sub = 0;
        int k;
        int r0;
        for (int i = 0; i < a[0]; i++){
            found = false;
            r0 = (int) (Math.random() * s[s.length - 1]);
            k = 1;
            while(!found && k <= (s.length - 1)){
                if(r0 < s[k] && r0 >= s[k - 1]){
                    found = true;
                    sub = k;
                };
                k++;
            };

            r[i] = sub;
        }

        for (int i = 0; i < r.length; i++){
            System.out.print(r[i] + " ");
            if ((i + 1) % 25 == 0){
                System.out.println();
            }
        }
    }
}
