package exercicio03;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        List<Produtos> lista = Arrays.asList(
                new Produtos("Celular",2000,"Eletronico"),
                new Produtos("Pijama",80,"Roupa"),
                new Produtos("TV",3000,"Eletronico")
        );
    }
}
