import java.util.HashSet;
import java.util.Set;

public class Exehash {
    public static void main(String[] args) {
        // Criando um HashSet
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos
        conjunto.add("maçã");
        conjunto.add("banana");
        conjunto.add("laranja");
        conjunto.add("maçã"); // Tentativa de adicionar um elemento duplicado

        // Verificando o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // Verificando se um elemento está presente
        System.out.println("Contém 'uva'? " + conjunto.contains("uva"));

        // Percorrendo o conjunto
        for (String fruta : conjunto) {
            System.out.println(fruta);
        }
    }
}