package exemplo2;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<String> lista = Arrays.asList("Ana","Bernarndo","Guilherme","Vinicius","Pérola");

        List<String> nova = lista.stream().filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .toList();

        System.out.println(nova);
    }
}
