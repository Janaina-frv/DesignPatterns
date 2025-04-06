package src.Comportamental.ChainOfResponsability;

public class Main {
  public static void main(String[] args) {
    // Criar os handlers
    AvaliadorHandler aprovadorAutomaticoHandler =
     new AprovadorAutomaticoHandler();
    AvaliadorHandler revisorHandler = new RevisorHandler();
    AvaliadorHandler rejeicaoHandler = new RejeicaoHandler();

    // Configurar a cadeia de responsabilidade
    aprovadorAutomaticoHandler.setNextHandler(revisorHandler);
    revisorHandler.setNextHandler(rejeicaoHandler);

    // Processar diferentes notas
    double[] grades = {95, 85, 65};

    for (double grade : grades) {
       aprovadorAutomaticoHandler.handleRequest(grade);
    }
  }
}