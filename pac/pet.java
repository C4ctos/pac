package peet;

import java.io.IOException;

import filere.file_c;
import filere.file_r;
import filere.file_w;
import variables.global;


public class pet{

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

    /*espécie, raça, idade e peso */


    public void criar_pet(String nome, String especie, String idade, String peso,String dono){

        global.p_id++;

        create(global.p_id + "_p " + "_dados");

        writ(global.p_id + "_p " + "_dados", 
        "nome:    " + nome + "\n" + 
        "especie: " + especie + "\n" + 
        "idade:   " + idade + "\n" + 
        "peso:    " + peso + "\n"  + 
        "dono:    " + dono);
    }


    public String encontrar_pet_nome(String nome){

        file_r file_r = new file_r();

        for(int i = 0; i < global.p_id; i++){

            try {
                linha_coluna = file_r.read_array(i + "_p _dados");
                }catch (IOException e){
            }

            boolean b = false;

            for(int l = 0; l < nome.length(); l++){

                if(linha_coluna[l+9][0] == nome.charAt(l)){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }

            if(b){
                return(i + "_p _dados");
            }
        }
        return "não";
    }


    public void excluir_pet(String nome){

        file_w file_w = new file_w();

        String coisa = encontrar_pet_nome(nome);

        if(coisa == "não"){
            System.out.println("ele nem ta...");
        }else{
            file_w.writ(coisa, global.wawa);
        }
    }


    public String listar_pet(){

        String return_String = "";

        file_r file_r = new file_r();


        for(int i = 0; i < global.p_id; i++){

            try {
                linha_coluna = file_r.read_array(i + "_p _dados");
                }catch (IOException e){
            }

            for(int l = 0; l < 100; l++){
                if(linha_coluna[l][0] == global.wawa.charAt(l)){
                    
                }else{
                    return_String += linha_coluna[l+9][0];
                }
            }
        }
        return return_String;
    }
}
