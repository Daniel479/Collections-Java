
import java.util.LinkedHashSet;
import java.util.Set;

public class Exlinkedhashset {
    public static void main(String[] args) {
        // Criando um LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adicionando elementos
        linkedHashSet.add("um");
        linkedHashSet.add("dois");
        linkedHashSet.add("três");
        linkedHashSet.add("quatro");

        System.out.println("\nLinkedHashSet:");
        for (String elemento : linkedHashSet) {
            System.out.println(elemento);
        }
    }
}