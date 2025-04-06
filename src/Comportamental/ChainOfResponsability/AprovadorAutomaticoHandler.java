package src.Comportamental.ChainOfResponsability;

public class AprovadorAutomaticoHandler extends AvaliadorHandler {

    @Override
    public void handleRequest(double grade) {
        if (grade >= 90) {
         System.out.println("Nota " + grade + " aprovada automaticamente.");
        } else if (nextHandler != null) {
          nextHandler.handleRequest(grade);
        }
    }
}