import java.util.Set;
import java.util.TreeSet;

public class Extreeset {
    public static void main(String[] args) {
        // Criando um TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // Adicionando elementos
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);

        System.out.println("\nTreeSet:");
        for (Integer elemento : treeSet) {
            System.out.println(elemento);
        }
    }
}