import java.util.ArrayList;
import java.util.List;

public class arquivo {
    
    public void adicionar_item(){
        List<String> palavras = new ArrayList<String>();

        palavras.add("teste");
        palavras.add("ola");
        palavras.add("bom-dia");

        for(String p: palavras){
            System.out.println(p);
        }

        palavras.remove(2);
        palavras.remove("teste");


        for(String p: palavras){
            System.out.println(p);
        }
    }


    public static void main(String[] args){
        arquivo a = new arquivo();

        a.adicionar_item();



        int[][] array_ = new int[2][3];
        System.out.println(array_.length); // linhas
        System.out.println(array_[0].length); //colunas
        
    }
}