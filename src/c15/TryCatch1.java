package c15;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatch1 {

    public static void main(String arg[]) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("test");
        } catch (IOException e) {
            System.out.println("error");
        }

        try (FileWriter fw2 = new FileWriter("data.txt");) {
            fw.write("test");
        } catch (IOException e) {
            System.out.println("error");
        }



    }

}
