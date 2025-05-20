package clicis;

import java.io.IOException;
import java.util.List;

import filere.file_c;
import filere.file_r;
import filere.file_w;


public class servres{


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

    public char[][] read_array(String coisa) throws IOException{

        file_r file_r = new file_r();
        return (file_r.read_array(coisa));
    }

    public List<String> read_List (String coisa){

        file_r file_r = new file_r();
        return (file_r.read_List(coisa));
    }


    public void add_d_servres_to_d_claceli(String oque, String a_quem){

        claceli claceli = new claceli();
        servres servres = new servres();

        String to_writ = "";
        //String o_oque = read(claceli.encontrar_cliente_nome(a_quem));

        for(String p: servres.read_List(claceli.encontrar_cliente_nome(a_quem))){

            to_writ = to_writ + p + "\n";
            //System.out.println(p);
        }

        to_writ = to_writ.subSequence(0, to_writ.length()-1).toString();
        to_writ += (oque + ", ");

        //System.out.println(to_writ);
        //System.out.println(o_oque + " : " + oque);

        writ(claceli.encontrar_cliente_nome(a_quem), to_writ);
    }

}
