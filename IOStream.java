package Projects;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("M:\\Practice\\Projects\\src\\Projects\\sample.txt");
        int data = fis.read();// InputStream read each character as byte form. return type is int
        while (data != -1){
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
