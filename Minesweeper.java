public class Minesweeper {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[2]);
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        char[][] a = new char[m][n];
        int[] bombx = new int[k];
        int[] bomby = new int[k];

        for (int i = 0; i < k; i++){
            boolean collide;
            do {
                collide = false;
                bombx[i] = (int) (Math.random() * n);
                bomby[i] = (int) (Math.random() * m);
                for (int c = 0; c < i; c++){
                    if (bombx[c] == bombx[i] && bomby[c] == bomby[i]){
                        collide = true;
                        break;
                    }
                }
            } while(collide);
            a[bomby[i]][bombx[i]] = '*';
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (a[i][j] != '*'){
                    int count = 0;
                    for (int e = -1; e <= 1; e++){
                        for (int l = -1; l <= 1; l++){
                            int newx = i + e;
                            int newy = j + l;
                            if (newx >= 0 && newx < m && newy >= 0 && newy < n && a[newx][newy] == '*'){
                                count++;
                            }
                        }
                    }
                    a[i][j] = (char) (count + '0');
                }
                System.out.print(a[i][j] + "  ");
            }
            System.err.println();
        }
    }
}
