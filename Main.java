import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // n and m are in same line
        long[][] matrix = new long[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                matrix[i][j] = Long.parseLong(st.nextToken());
            }
        }
        int q = Integer.parseInt(br.readLine());
        while(q-->0){
            long target = Long.parseLong(br.readLine());
            int i=0, j=m-1;
            boolean done=false;
            while(i<n && j>=0){
                if(matrix[i][j]>target)
                    j--;
                else if(matrix[i][j]<target)
                    i++;
                else{
                    i++;
                    j++;
                    System.out.println(i+" "+j);
                    done =true ;
                    break;
                }
            }
            if(done==false)System.out.println(-1);
        }
    }
}