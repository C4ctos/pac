package filere;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class file_r{

    public String read_one_line(String coisa){

        String data = "";


        try {
            File myObj = new File(coisa + ".txt");
            Scanner myReader = new Scanner(myObj);
            //while (myReader.hasNextLine()) {
                data = myReader.nextLine(); 
            //}
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return(data);
    }


    public String read_lest_line(String coisa){

        String data = "";


        try {
            File myObj = new File(coisa + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); 
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return(data);
    }

    
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


    public List<String> read_List(String coisa){

        List<String> palavras = new ArrayList<String>();

        try {
            File myObj = new File(coisa + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                palavras.add (myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return(palavras);
    }


    public char[][] read_array(String coisa) throws IOException{

        char[][] r_linha_coluna = new char[1000][1000];

        Path filePath = Paths.get(coisa + ".txt");
        
        FileReader reader = new FileReader(filePath.toFile());

        int charInt;
        
        int l = 0;
        int c = 0;
        
        while ((charInt = reader.read()) != -1){

            r_linha_coluna[l][c] = (char) charInt;

            //System.out.println(l + " : " + c);

            l++;

            if(charInt == 10){
                c++;
            }
        }

        reader.close();

        return r_linha_coluna;
    }


    public void read_pirnt(String coisa){


        try {
            File myObj = new File(coisa + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine()); 
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
