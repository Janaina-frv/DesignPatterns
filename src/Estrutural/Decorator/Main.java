package src.Estrutural.Decorator;

public class Main {
    public static void main(String[] args) {
    // Cria uma nota básica
    Nota basicGrade = new NotaBasica(85);
    System.out.println("Valor: " + basicGrade.getValue());
    System.out.println("Descrição: " + basicGrade.getDescription());

    // Adiciona um bônus à nota
    Nota bonusGrade = new NotaBonusDecorator(basicGrade, 5);
    System.out.println("Valor: " + bonusGrade.getValue());
    System.out.println("Descrição: " + bonusGrade.getDescription());

    // Adiciona um peso à nota com bônus
    Nota weightedGrade = new NotaComPesoDecorator(bonusGrade, 1.2);
    System.out.println("Valor: " + weightedGrade.getValue());
    System.out.println("Descrição: " + weightedGrade.getDescription());
    }
}