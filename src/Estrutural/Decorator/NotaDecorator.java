package src.Estrutural.Decorator;

public abstract class NotaDecorator implements Nota {

  protected Nota decoratedNota;

  public NotaDecorator(Nota decoratedNota) {
    this.decoratedNota = decoratedNota;
  }

  @Override
  public double getValue() {
    return decoratedNota.getValue();
  }

  @Override
  public String getDescription() {
    return decoratedNota.getDescription();
  }
}