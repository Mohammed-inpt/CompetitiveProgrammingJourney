import java.io.*;
import java.util.StringTokenizer;

public class Codeforces31 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int t = io.nextInt();
        while(t-->0){
            int n = io.nextInt();
            int[] sum = new int[n+1];
            for(int i= 1; i <sum.length; i++){
                sum[i] = sum[i-1] + sumdigits(i);
            }

            io.println(sum[n]);
        }
        io.flush();
    }
    public static int sumdigits(int n){
        int sum = 0;
        while(n > 0){
            sum+= n%10;
            n=n/10;
        }
        return sum;
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