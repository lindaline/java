package linda;

import java.io.*;

public class Inputstream {
    public static void main(String[] args) {
//        Inputstream();
//        Filereader();
        try {
            BufferedReader br=new BufferedReader(new FileReader("date.txt"));
            String line=br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Filereader() {
        try {
            FileReader fr=new FileReader("date.txt");
            int n=fr.read();
            while(n != -1){
                System.out.print((char)n);
                n=fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Inputstream() {
        File file = new File("date.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1) {
                System.out.print((char)n);
                n=is.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
