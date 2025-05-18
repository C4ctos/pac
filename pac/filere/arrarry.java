package filere;

public class arrarry{


    public char[] string_to_array(String to_array){
        char[] chararray = new char[1000];
        for(int i = 0; i < to_array.length(); i++){
            chararray[i] = to_array.charAt(i);
        }
        return (chararray);
    }

    public String array_to_string(char[][] to_string){
            String string = "";
        for (int j = 0; j < to_string.length; j++){
            for(int i = 0; i < to_string.length; i++){
                string += to_string[i][j];
            }
        }
        return (string);
    }


    public void print_array(char[] to_print){
        for(int i = 0; i < to_print.length; i++){
            System.out.print(to_print[i]);
        }
    }
    
    public void print_array(char[][] to_print){
        for (int j = 0; j < to_print.length; j++){
            for(int i = 0; i < to_print.length; i++){
                System.out.print(to_print[i][j]);
            }
        }
    }
}
