import java.io.File;

public class ShowAllFileAndDirectory {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Program Files (x86)\\Windows Defender");
        String[] fileAndDirectory = f.list();
        for (String singleItem : fileAndDirectory) {
            System.out.println(singleItem);
        }
    }
}
