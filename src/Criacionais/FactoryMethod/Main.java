package src.Criacionais.FactoryMethod;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
// Fábrica para criar notas de exame
        NotaFactory notaProvaFactory = new NotaProvaFactory();
        Nota notaProva = notaProvaFactory.criarNota(90.0);
        System.out.println("Tipo de nota: " + notaProva.getType() + ", Valor: " + notaProva.getValue());

// Fábrica para criar notas de tarefa
        NotaFactory trabalhoFactory = new NotaTrabalhoFactory();
        Nota notaTrabalho = trabalhoFactory.criarNota(85.0);
        System.out.println("Tipo de nota: " + notaTrabalho.getType() + ", Valor: " + notaTrabalho.getValue());


        List<NotaFactory> notaFactoryList = Arrays.asList(new NotaProvaFactory(), new NotaTrabalhoFactory());

        for (NotaFactory notaFactory : notaFactoryList) {
            double notaRecebida = obternotaTela();
            Nota nota = notaFactory.criarNota(notaRecebida);
            System.out.println("Tipo de Nota: " + nota.getType() + ", Valor: " + nota.getValue());
        }

    }

    private static double obternotaTela() {
        return 8;
    }
}