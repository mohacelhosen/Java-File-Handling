import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadBufferedReader {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("myBirdInfo.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine(); //read a line of text and return as string
        while (line !=null){
            System.out.println(line);
            line = br.readLine();
            br.close();
        }
    }
}
