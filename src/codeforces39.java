import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class codeforces39 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.nextInt();
        while(t-->0){
            int n = io.nextInt();
            int m = io.nextInt();
            int[] k = new int[n];
            int start =0;
            int finish = n-1;
            String s = io.nextLine();
            io.println(s);
            for(int j =0; j<n-1;j++){
                if(s.charAt(j) == 'L'){
                    start++;
                }else{
                    finish--;
                }
            }
            assert start == finish;
            int[] ans = new int[n];
            ans[n-1] = k[n-1]%m;
            for (int i = n-2; i>=0; i--){
                if(s.charAt(i) == 'L') {
                    ans[i] = (k[--start]*ans[i+1] )% m;
                }
                else{
                    ans[i] = (k[++finish]*ans[i+1]) % m;
                }
            }
            for(int i = 0; i<n; i++){
                io.print(ans[i] + " ");
            }

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
