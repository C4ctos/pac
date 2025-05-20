package filere;

import java.io.FileWriter;
import java.io.IOException;

import arras.arrarry;

public class file_w{

    public void writ(String coisa,char[][] a_coisar){

        arrarry arrarry = new arrarry();

        String to_writ = arrarry.array_to_string(a_coisar);

        try {
            FileWriter myWriter = new FileWriter(coisa + ".txt");
            myWriter.write(to_writ);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void writ(String coisa, String a_coisar){

        try {
            FileWriter myWriter = new FileWriter(coisa + ".txt");
            myWriter.write(a_coisar);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}