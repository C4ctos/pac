package clicis;

import java.io.IOException;

import filere.file_c;
import filere.file_r;
import filere.file_w;
import variables.global;


public class claceli{

    char[][] linha_coluna = new char[1000][1000];


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


    public void criar_cliente(String nome, String telefone, String email){

        global.c_id++;

        create(global.c_id + "_c " + "_dados");

        writ(global.c_id + "_c " + "_dados", "nome:     " + nome + "\n" + "telefone: " + telefone + "\n" + "email:    " + email + "\n");
    }


    public String encontrar_cliente_nome(String nome){

        file_r file_r = new file_r();

        for(int i = 0; i < global.c_id; i++){

            try {
                linha_coluna = file_r.read_array(i + "_c _dados");
                } catch (IOException e) {
            }

            boolean b = false;

            for(int l = 0; l < nome.length(); l++){
                if(linha_coluna[l+10][0] == nome.charAt(l)){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }

            if(b){
                return(i + "_c _dados");
            }
        }
        return "não";
    }

    public String encontrar_cliente_telefone(String telefone){

        file_r file_r = new file_r();

        for(int i = 0; i < global.c_id; i++){

            try {
                linha_coluna = file_r.read_array(i + "_c _dados");
                } catch (IOException e) {
            }

            boolean b = false;

            for(int l = 0; l < telefone.length(); l++){
                if(linha_coluna[l+10][1] == telefone.charAt(l)){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }

            if(b){
                return(i + "_c _dados");
            }
        }
        return "não";
    }

    public String encontrar_cliente_email(String email){

        file_r file_r = new file_r();

        for(int i = 0; i < global.c_id; i++){

            try {
                linha_coluna = file_r.read_array(i + "_c _dados");
                } catch (IOException e) {
            }

            boolean b = false;

            for(int l = 0; l < email.length(); l++){
                if(linha_coluna[l+10][2] == email.charAt(l)){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }

            if(b){
                return(i + "_c _dados");
            }
        }
        return "não";
    }
}