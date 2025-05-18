import arras.arrarry;
import variables.global;
import clicis.claceli;


import filere.file_c;
import filere.file_w;
import filere.file_r;


public class mi{

    char[][] linha_coluna = new char[10000][10000];


    public void create(String eme){

        file_c file_c = new file_c();
        file_c.File_create(eme);
    }


    public void writ(String coisa, char[][] a_coisar){

        file_w file_w = new file_w();
        file_w.writ(coisa, a_coisar);
    }

    public void writ(String coisa, String a_coisar){

        file_w file_w = new file_w();
        file_w.writ(coisa, a_coisar);
    }


    public String read(String coisa){

        file_r file_r = new file_r();
        return (file_r.read(coisa));
    }


    public void set_up(){

        create("data_file");

        Integer bs2 = 0;
        
        
        if(read("data_file") == ""){
            writ("data_file", "0");
        }else{
            bs2 = Integer.valueOf(read("data_file"));
            global.c_id = bs2;
        }
        
    }


    public void set_down(){

        writ("data_file", String.valueOf(global.c_id));
    }



    public static void main(String[] args){

        mi mi = new mi();
        claceli claceli = new claceli();
        arrarry arrarry = new arrarry();
        file_r file_r = new file_r();

        mi.set_up();


        
        //claceli.criar_cliente("tartag", "000000", "null");
        //claceli.criar_cliente("fartag", "000000", "null");
        //claceli.criar_cliente("mortag", "000000", "null");
        //claceli.criar_cliente("nartag", "000000", "null");
        //claceli.criar_cliente("dartag", "000000", "null");

        System.out.println(claceli.encontrar_cliente_nome("nartag"));
        


        mi.set_down();
    }
}
