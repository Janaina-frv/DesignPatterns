package src.Estrutural.Decorator;

public class NotaComPesoDecorator extends NotaDecorator {
  private double peso;

  public NotaComPesoDecorator(Nota decoratedNota, double peso) {
    super(decoratedNota);
    this.peso = peso;
  }

  @Override
  public double getValue() {
    return decoratedNota.getValue() * peso;
  }

  @Override
  public String getDescription() {
    return decoratedNota.getDescription() + " com peso";
  }
}