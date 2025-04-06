package src.Comportamental.ChainOfResponsability;

public class RejeicaoHandler extends AvaliadorHandler {

    @Override
    public void handleRequest(double grade) {
       if (grade < 70) {
          System.out.println("Nota " + grade + " reprovada.");
       } else if (nextHandler != null) {
          nextHandler.handleRequest(grade);
       }
    }
}