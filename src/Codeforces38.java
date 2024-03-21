import java.io.*;
import java.util.StringTokenizer;

public class Codeforces38 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int t = io.nextInt();
        label:while(t-->0){
            int n = io.nextInt();
            int f = io.nextInt();
            int a = io.nextInt();
            int b = io.nextInt();
            int[] k = new int[n];
            for(int i = 0; i < n; i++){
                k[i] = io.nextInt();
            };
            int start = 0;
            for(int i = 0; i< n; i++) {
                f -= Math.min(a * (k[i] - start), b);
                start = k[i];
                if(f < 0){
                    io.println("NO");
                    continue label;
                };
            }
            io.println(f>0?"YES":"NO");
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
