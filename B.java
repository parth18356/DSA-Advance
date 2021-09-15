import java.util.*;

public class B {
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
                if(size>0){
                    --size;
                    if(left>right-rstart){
                        --rstart;
                        --left;
                        arr[rstart] = arr[left];
                        --right;
                    }
                    else --right;
                }
            }
            else if(q==2){
                if(size%2==1){
                    --rstart;
                    arr[rstart] = in.nextInt();
                }
                else{
                    arr[left] = in.nextInt();
                    ++left;
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
                }
                else{
                    arr[right] = in.nextInt();
                    ++right;
                }
                ++size;
            }
        }
    }
}
