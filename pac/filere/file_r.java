package filere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_r{
    
    public String read(String coisa){

        String data = "";


        try {
            File myObj = new File(coisa + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine(); 
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return(data);
    }
}
