package filere;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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


    public char[][] read_array(String coisa) throws IOException{

        char[][] r_linha_coluna =new char[1000][1000];

        Path filePath = Paths.get(coisa + ".txt");
        
        FileReader reader = new FileReader(filePath.toFile());

        int charInt;
        
        int l = 0;
        int c = 0;
        
        while ((charInt = reader.read()) != -1){

            r_linha_coluna[l][c] = (char) charInt;

            l++;

            if(charInt == 10){
                c++;
            }
        }

        reader.close();

        return r_linha_coluna;
    }
}
