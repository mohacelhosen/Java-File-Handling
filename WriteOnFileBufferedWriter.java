import java.io.*;

public class WriteOnFileBufferedWriter {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter( new FileWriter("myBirdInfo.txt"));
        bw.write("It's all about Moyna Bird");
        bw.newLine();
        bw.write(77);
        File f = new File("myBirdInfo.txt");
        System.out.println(f.exists());
        bw.newLine();
        bw.write("Overall i have 3 birds");
        bw.flush();
        bw.close();

    }
}
