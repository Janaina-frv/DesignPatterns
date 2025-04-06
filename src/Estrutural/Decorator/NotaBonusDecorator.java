package src.Estrutural.Decorator;

public class NotaBonusDecorator extends NotaDecorator {
  private double bonus;

  public NotaBonusDecorator(Nota decoratedNota, double bonus) {
    super(decoratedNota);
    this.bonus = bonus;
  }

  @Override
  public double getValue()   {
    return decoratedNota.getValue() + bonus;
  }

  @Override
  public String getDescription() {
    return decoratedNota.getDescription() + " com bônus";
  }
}