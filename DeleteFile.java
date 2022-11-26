import java.io.File;

public class DeleteFile {
    public static void main(String[] args) throws Exception{
        File f = new File("abc.txt");
        f.createNewFile();
        System.out.println(f.getAbsolutePath());
        f.delete();
        System.out.println(f.exists());
    }
}
