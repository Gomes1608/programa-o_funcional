package exercicio02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Empregado> lista = Arrays.asList(
                new Empregado("Gui",1500,1),
                new Empregado("Vini",15000,21),
                new Empregado("Pérola",8000,16)
        );
        List<Empregado> reajustados = lista.stream()
                .map(empregado ->{
                    double novoSalario;
                    if (empregado.anosExp()>=5){
                        novoSalario = empregado.salarioAtual()*1.20;
                    }else {
                        novoSalario = empregado.salarioAtual()*1.10;
                    }
                    return new Empregado(empregado.nome(),novoSalario,empregado.anosExp());
                } )
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();
        reajustados.forEach(System.out::println);
    }
}
