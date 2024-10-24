import java.util.Map.Entry;
import java.util.TreeMap;

public class Extreemap {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Adicionando palavras e definições
        dictionary.put("Apple", "Uma fruta");
        dictionary.put("Banana", "Outra fruta");
        dictionary.put("Cherry", "Uma cereja");

        // Iterando sobre o TreeMap
        for (Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Primeiro e último elemento na ordem natural
        System.out.println("Primeira entrada: " + dictionary.firstKey());
        System.out.println("Última entrada: " + dictionary.lastKey());
    }
}

