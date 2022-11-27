import java.io.*;

public class WriteViaPrintWriter {
    public static void main(String[] args) throws Exception {
        String fileName = "abc.txt";
        File f = new File(fileName);
        PrintWriter pr = new PrintWriter(fileName);
        pr.print("Welcome to the world of java");
        pr.flush();
        pr.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
