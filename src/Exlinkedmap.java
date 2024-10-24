import java.util.LinkedHashMap;
import java.util.Map;

public class Exlinkedmap {

    public static void main(String[] args) {
        Map<String, Double> temperatura = new LinkedHashMap<>();

        // Adicionando entradas
        temperatura.put("Monday", 25.5);
        temperatura.put("Tuesday", 27.0);
        temperatura.put("Wednesday", 26.5);

        // Iterando sobre o LinkedHashMap
        for (Map.Entry<String, Double> entry : temperatura.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Acessando um valor específico
        System.out.println("Temperatura na Quarta-feira: " + temperatura.get("Wednesday"));
    }
}
