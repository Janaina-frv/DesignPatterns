package src.Comportamental.Strategy;

public class Main {
public static void main(String[] args) {
  // Criar o contexto
  NotaContext context = new NotaContext();

  // Criar diferentes conjuntos de notas
  double[] grades = {85, 90, 78, 92, 88};

  // Usar a estratégia de média aritmética
  context.setStrategy(new MediaAritmeticaStrategy());
  System.out.println("Média aritmética: " +
    context.executeStrategy(grades));

  // Usar a estratégia de média ponderada
  double[] weights = {0.1, 0.2, 0.3, 0.2, 0.2};
  context.setStrategy(new MediaPonderadaStrategy(weights));
  System.out.println("Média ponderada: " +
    context.executeStrategy(grades));

  // Usar a estratégia de média harmônica
  context.setStrategy(new MediaHarmonicaStrategy());
  System.out.println("Média harmônica: " +
   context.executeStrategy(grades));
}
}