import java.util.HashMap;
import java.util.Map;

public class Exhashmap {
    public static void main(String[] args) {
        // Criando um HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Adicionando pares chave-valor
        ages.put("Daniel", 22);
        ages.put("Bianca", 25);
        ages.put("Fernanda", 35);

        // Acessando um valor
        System.out.println("Idade de Daniel: " + ages.get("Daniel"));

        // Verificando se um chave existe
        System.out.println("Contém Bianca? " + ages.containsKey("Bianca"));

        // Removendo um par
        ages.remove("Fernanda");

        // Iterando sobre o mapa
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}