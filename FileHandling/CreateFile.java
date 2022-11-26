import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception{
        File f = new File("abc.txt");// it will create object not file
        System.out.println(f.exists()); // if there is no file "abc.txt" return false
        f.createNewFile();// create file
        System.out.println(f.exists());//if there is a file "abc.txt" return true
    }
}