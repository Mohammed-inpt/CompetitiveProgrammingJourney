import java.io.*;
import java.util.StringTokenizer;

public class codeforces40 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.nextInt();
        while(t-->0){
            int ans =0;
            int a = io.nextInt();
            int b = io.nextInt();
            if(a ==1){
                ans = b*b;
            }else{
                int g = gcd(b,a);
                if(g == 1){
                    ans = a*b;
                }else{
                    if(g == a){
                        ans =b*(b/g);
                    }else {
                        ans = b*(a/g);
                    }
                }
            }
            io.println(ans);
        }
        io.flush();
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
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
        public String nextLine() {
            try {
                return r.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
}
