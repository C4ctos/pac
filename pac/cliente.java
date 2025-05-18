import filere.file_c;
import filere.file_w;
import filere.file_r;


public class cliente{


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


    int c_id = 0;

    public void criar_cliente(String nome, String telefone, String email){

        c_id++;

        create(c_id + "_c  " + nome + "_dados");

        writ(c_id + "_c  " + nome + "_dados", "nome:     " + nome + "\n" + "telefone: " + telefone + "\n" + "email:    " + email + "\n");
    }
    
}