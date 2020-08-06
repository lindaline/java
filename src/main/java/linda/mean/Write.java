package linda.mean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\jk\\");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("D:\\jk\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
