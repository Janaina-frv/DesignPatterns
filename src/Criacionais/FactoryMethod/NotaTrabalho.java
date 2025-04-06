package src.Criacionais.FactoryMethod;

public class NotaTrabalho extends Nota {
    public NotaTrabalho(double value) {
        super(value+2);
    }

    @Override
    public String getType() {
        return "Trabalho";
    }
}
