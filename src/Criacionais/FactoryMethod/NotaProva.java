package src.Criacionais.FactoryMethod;

public class NotaProva extends Nota {

  public NotaProva(double value) {
    super(value);
  }

  @Override
  public String getType() {
    return "Prova";
  }

}
