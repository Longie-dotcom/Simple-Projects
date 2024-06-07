public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        //array of zero (+)
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = '+';
            }
        }

        //Bitwise (adding one (-))
            for (int j = 1; j < n; j = j * 2){
                int m = j;
                for (int k = 0; k < j; k++){
                    if (a[0][k] == '+'){
                        a[0][m] = '-';
                    } else {
                        a[0][m] = '+';
                    }
                    m++;
                    if (m == n){
                        break;
                    }
                }
            }
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j = j * 2){
                int m = j;
                for (int k = 0; k < j; k++){
                    if (a[k][i] == '+'){
                        a[m][i] = '-';
                    } else {
                        a[m][i] = '+';
                    }
                    m++;
                    if (m == n){
                        break;
                    }
                }
            }
        }
            
        //Printing
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
