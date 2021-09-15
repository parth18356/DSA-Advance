import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[4*n];
        int left=0, right=2*n, size=0, rstart = 2*n;
        for(int i=0; i<n; ++i){
            int q = in.nextInt();
            if(q == 3){
                try{
                System.out.println(arr[left-1]);
                }
                catch(Exception e){
                    System.out.println("-1");
                }
            }
            else if(q==4){

            }
            else if(q==2){
                if(size%2==1){
                    --rstart;
                    arr[rstart] = in.nextInt();
                    // System.out.println("Added to right - " + arr[rstart+1]);
                }
                else{
                    arr[left] = in.nextInt();
                    ++left;
                    // System.out.println("Added to left - " + arr[left-1]);
                }
                ++size;
            }
            else{
                if(left<=right-rstart){
                    arr[right] = in.nextInt();
                    arr[left] = arr[rstart];
                    ++right;
                    ++left;
                    ++rstart;
                    // System.out.println("Added to left - " + arr[left-1]);
                }
                else{
                    arr[right] = in.nextInt();
                    ++right;
                    // System.out.println("Added to right - " + arr[right-1]);
                }
                ++size;
            }
        }
    }
}
