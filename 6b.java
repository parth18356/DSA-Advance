import java.util.*;

class Main{
    static int mod = 1000000007;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <=2) System.out.println("1");
        else{
            long[][] mat = new long[3][3];
            mat[0][0] = 1;
            mat[0][2] = 1;
            mat[1][0] = 1;
            mat[2][1] = 1;
            long[][] mul = solve(mat, mat, n);
            System.out.println(mul[0][0]);
        }
    }

    public static long[][] solve(long[][] curr, long[][] og, int n){
        if(n==0) return curr;
        if(n==1) {
            return curr;
        }
        else{
            long[][] mat = solve(curr, og, n/2);
            if(n%2 == 0) return matmul(mat, mat);
            else return matmul(matmul(mat, mat), og);
        }
    }

    public static long[][] matmul(long[][] a, long[][] b){
        long[][] mul = new long[a.length][b[0].length];
        for(int i=0; i<mul.length; ++i){
            for(int j=0; j<mul[i].length; ++j){
                for(int k=0; k<b.length; ++k){
                    mul[i][j]=(long)(mul[i][j] + (a[i][k]*b[k][j])%mod)%mod;
                }
            }
        }
        return mul;
    }
}