package src.Comportamental.ChainOfResponsability;

public class RevisorHandler extends AvaliadorHandler {

 @Override
 public void handleRequest(double grade) {
    if (grade >= 70 && grade < 90) {
      System.out.println("Nota " + grade + " precisa de revisão.");
     } else if (nextHandler != null) {
       nextHandler.handleRequest(grade);
     }
 }
}