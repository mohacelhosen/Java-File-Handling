package Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class MergeFile {
    public static void main(String[] args) throws Exception {
        PrintWriter pr = new PrintWriter("Final.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("M:\\Practice\\Projects\\src\\Projects\\First.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("M:\\Practice\\Projects\\src\\Projects\\Second.txt"));

        String Fline = br1.readLine();
        String Sline = br2.readLine();

        while (Fline != null){
            pr.write(Fline);
            Fline = br1.readLine();
        }
        while (Sline !=null){
            pr.write(Sline);
            Sline = br2.readLine();
        }
        pr.flush();
        pr.close();


        BufferedReader br = new BufferedReader(new FileReader("Final.txt"));
        System.out.println(br.readLine());
    }
}
