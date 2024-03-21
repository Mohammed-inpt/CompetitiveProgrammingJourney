import java.io.*;
import java.util.StringTokenizer;

public class CodeForces32 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();
        while(t-->0){
            int n = io.nextInt();
            int[] k = new int[n];
            int count = 0;
            int first =1;
            int second = n;
            while (count < n) {
                if(count % 2 == 0){
                    k[count] = first;
                    first++;
                }else{
                    k[count] = second;
                    second--;
                }
                count++;
            }

            for(int i = 0; i< n; i++){
                io.print(k[i] + " ");
            }
            io.println();
        }
        io.flush();


    }
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;
        // standard input
        public Kattio() { this(System.in, System.out); }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(problemName + ".out");
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }
        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) {}
            return null;
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
}
