import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Stack;
public class Main {
    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /** call this method to initialize reader for InputStream */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input) );
            tokenizer = new StringTokenizer("");
        }

        /** get next word */
        static String next() throws IOException {
            while ( ! tokenizer.hasMoreTokens() ) {
                //TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine() );
            }
            return tokenizer.nextToken();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt( next() );
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble( next() );
        }
    }
    static Queue<Integer> queue;
    static void reverseKelements(int k) throws IOException
    {   int n = queue.size();
        if (k < 0 || k > queue.size() || queue.isEmpty()) {
            System.out.println(-1);
            return;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int curr = queue.poll();
            stack.push(curr);
        }

        while (!stack.isEmpty()) {
            int a = stack.pop();
            queue.add(a);
        }
        for (int i = 0; i < n - k; i++) {
            int b = queue.poll();
            queue.add(b);
        }
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) throws IOException
    {
        queue = new LinkedList<Integer>();
        Reader.init(System.in);
        int n = Reader.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(Reader.nextInt());
        }
        int k=Reader.nextInt();
        reverseKelements(k);
    }

}