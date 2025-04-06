package src.Estrutural.Decorator;

public class NotaBasica implements Nota {

    private double value;

    public NotaBasica(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
    @Override
    public String getDescription() {
        return "Nota básica";
    }
}