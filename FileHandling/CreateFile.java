package FileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\Practice\\JDBC\\src\\FileHandling\\myInfo.txt");
        if (f.createNewFile()){
            System.out.println("Successfully file created");
        }else {
            System.out.println("File already exist");
        }
    }
}
