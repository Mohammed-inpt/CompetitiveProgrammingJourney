import java.io.*;
import java.util.StringTokenizer;

public class Codeforces30 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.nextInt();
        while(t-->0){
            int x = io.nextInt();
            int n = io.nextInt();
            int ans = 1;
            for(int i =1 ; i*i<=x; i++){
                if(x%i==0){
                    if (n <= i) {
                        ans = Math.max(ans, x/i);
                    }
                    if (i <= x / n) {
                        ans = Math.max(ans, i);
                    }
                }
            }
            io.println(ans);
        }
        io.flush();
    }
}
class Kattio extends PrintWriter {
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