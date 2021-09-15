import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), d=sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] a, int[] b) -> b[2]-a[2]);
        for(int i=0; i<n; ++i){
            int start = sc.nextInt(), required = sc.nextInt(), curse = sc.nextInt();
            queue.add(new int[]{start, required, curse});
        }
        int ans = 0;
        while(queue.peek()!=null){
            int[] curr = queue.poll();
            int count = set.size();
            set = check(curr, d, set);
            if(count==set.size()) ans+=curr[2];
        }
        System.out.println(ans);
    }

    public static HashSet check(int[] a, int d, HashSet<Integer> set){
        HashSet<Integer> temp = new HashSet<>(set);
        for(int i=a[0]; i<=d; ++i){
            if(!set.contains(i)){
                temp.add(i);
                if(a[1] == 1){
                    return temp;
                }
                --a[1];
            }
        }
        return set;
    }
}
