import variables.global;
import clicis.claceli;


import filere.file_c;
import filere.file_w;
import peet.pet;
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


    public String read_one_line(String coisa){

        file_r file_r = new file_r();
        return (file_r.read_one_line(coisa));
    }


    public String read_lest_line(String coisa){

        file_r file_r = new file_r();
        return (file_r.read_lest_line(coisa));
    }


    public void set_up(){

        create("data_file");

        Integer bs2 = 0;
        
        
        if(read_one_line("data_file") == ""){
            writ("data_file", "0\n0");
        }else{
            bs2 = Integer.valueOf(read_one_line("data_file"));
            global.c_id = bs2;

            bs2 = Integer.valueOf(read_lest_line("data_file"));
            global.p_id = bs2;
        }
    }


    public void set_down(){

        writ("data_file", String.valueOf(global.c_id + "\n" + global.p_id));
    }



    public static void main(String[] args){

        mi mi = new mi();
        claceli claceli = new claceli();
        pet pet = new pet();
        file_r file_r = new file_r();

        mi.set_up();



        //pet.criar_pet("argano", "ovo?", "10000000", "BIG", "tartag");
        //pet.criar_pet("anjaro", "ovv?", "01000000", "BIIG", "fartag");
        //pet.criar_pet("carogo", "voo?", "00100000", "BIIIG", "mortag");
        //pet.criar_pet("mawawa", "vov?", "00010000", "BIIIIG", "nartag");
        //pet.criar_pet("arceno", "vvo?", "00001000", "BIIIIIG", "dartag");
        //pet.criar_pet("cargno", "vvv?", "00000100", "BIIIIIIG", "bartag");
        //pet.criar_pet("jogino", "ooo?", "00000010", "BIIIIIIIG", "tartag");
        //pet.criar_pet("fatono", "oov?", "00000001", "BIIIIIIIIG", "fartag");

        //file_r.read_pirnt(pet.encontrar_pet_nome("jogino"));

        //pet.excluir_pet("mawawa");

        //System.out.println(pet.listar_pet());


        //claceli.criar_cliente("tartag", "100000", "nul");
        //claceli.criar_cliente("fartag", "010000", "null");
        //claceli.criar_cliente("mortag", "001000", "nulll");
        //claceli.criar_cliente("nartag", "000100", "nullll");
        //claceli.criar_cliente("dartag", "000010", "nulllll");
        //claceli.criar_cliente("bartag", "000001", "nullllll");

        //file_r.read_pirnt(claceli.encontrar_cliente_nome("mortag"));

        //claceli.excluir_cliente("mortag");

        //System.out.println(claceli.listar_cliente());
        


        mi.set_down();
    }
}
