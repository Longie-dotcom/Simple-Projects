public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int wall = 0;
        int check = m;
        char ch;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ( wall <= i && i <= m && wall <= j && j <= m){
                    ch = '*';
                } else{
                    ch = '0';
                };
                System.out.print(ch + "  ");
            };
        m++;
        if (i > check - 1){
            wall++;
        };
        System.out.println();
        }
    }
}
