import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter(new File("valjund1.txt"));
//        pw.println("println teeb uue rea");
//        pw.print("tavaline print ei tee uut rida ('Juku on seep samal real')");
//        pw.println(" Juku");
//        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("lugemine.txt"));
        String rida = br.readLine();
//        System.out.println(rida);
        while (rida != null){
            System.out.println(rida);
            String[] tykeldus = rida.split("u");
            System.out.println(Arrays.toString(tykeldus));
            rida = br.readLine();
        }
    }
}