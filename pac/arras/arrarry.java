package arras;


public class arrarry{


    public char[][] dimis_array(char[][] to_dimis){

        int quantidade_de_linha = 0;
        int quantidade_de_colunas = 0;
        boolean m = true;


        for(int i = 0; i > -1; i++){

            try{
                if(to_dimis[i][0] == 0){
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                quantidade_de_linha = i;
                break;
            }
        }

        //System.out.println(quantidade_de_linha);

        for(int i = 0, j = 0; i > -1; i++){

            try{
                if(to_dimis[j][i] == 0){
                    j++;
                    i=0;
                }
                m = true;
                //System.out.println(i);
                
            }catch(ArrayIndexOutOfBoundsException e){
                
                j++;
                
                if(i > quantidade_de_colunas){
                    quantidade_de_colunas = i-1;
                }

                if(m == true){
                    m = false;
                }else{
                    break;
                }
            }
        }

        //System.out.println(quantidade_de_colunas + " : " + quantidade_de_linha);
        char[][] dimisdo = new char[quantidade_de_colunas][quantidade_de_linha];


        return dimisdo;
    }

    public char[] string_to_array(String to_array){
        char[] chararray = new char[1000];
        for(int i = 0; i < to_array.length(); i++){
            chararray[i] = to_array.charAt(i);
        }
        return (chararray);
    }

    public String array_to_string(char[][] to_string){
        
            String string = "";

            System.out.println(dimis_array(to_string).length);

        for (int j = 0; j < to_string[0].length; j++){

            for(int i = 0; i < to_string.length; i++){

                //System.out.println(j + " : " + i);

                if(to_string[i][j] == 0){
                }else{
                    string += to_string[i][j];
                }
                
                //System.out.print((int) to_string[i][j] + " : ");
                //System.out.println(string);

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