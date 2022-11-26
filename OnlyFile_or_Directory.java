import java.io.File;
import java.io.FileNotFoundException;
// "isFile()" it's a method of File class. we can only access this method by file object
public class OnlyFile_or_Directory {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Program Files (x86)\\Windows Defender";
        int count=0;
        File f = new File(path);
        String[] name = f.list();
        for (String singleItem : name) {
            File item = new File(path,singleItem);
            if (item.isFile()){
                count++;
                System.out.println(singleItem);
            }
        }
        System.out.println("Total File = "+count);
    }
}
