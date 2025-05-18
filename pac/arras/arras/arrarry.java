package arras;


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


    public boolean array_0(char[][] o_0_em_questao){

        boolean b = false;

        for(int i = 0; i < 0; i++){
            if(o_0_em_questao[0][i] == 0){
                b = true;
            }

            if(o_0_em_questao[0][i + 1] != 0){
                b = false;
                i = 300;
            }
        }

        return b;
    }


    public void print_array(char[] to_print){
        for(int i = 0; i < to_print.length; i++){
            System.out.print(to_print[i]);
        }
    }
    
    public void print_array(char[][] to_print){

        System.out.println("---------------\n");

        for (int j = 0; j < 70; j++){

            if(array_0(to_print)){
                break;
            }

            for(int i = 0; i < 70; i++){

                if(to_print[i][j] != 0){

                    System.out.print(to_print[i][j]);
                }

                if(to_print[i][j] == 10){
                    i = to_print.length;
                }
            }
        }

        System.out.println("\n---------------");
    }
}