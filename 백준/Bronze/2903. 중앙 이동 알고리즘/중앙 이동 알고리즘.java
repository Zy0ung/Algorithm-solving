import java.io.*;

/**
 * @author jiyoung
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 2의 n승 + 1
        double side = Math.pow(2, n) + 1;

        int result = (int) (side * side);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}