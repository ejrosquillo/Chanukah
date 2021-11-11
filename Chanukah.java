import java.io.*;

public class Chanukah {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(read.readLine());
        while (cases-- > 0) {
            String[] tokens = read.readLine().split(" ");
            int num = Integer.parseInt(tokens[1]);
            write.write(tokens[0] + " " + (num * (num + 1) / 2 + num) + "\n");
        }

        read.close();
        write.close();
    }
}