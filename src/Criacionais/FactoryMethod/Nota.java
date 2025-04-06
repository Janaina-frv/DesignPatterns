package src.Criacionais.FactoryMethod;

public abstract class Nota {
protected double value;

public Nota(double value) {
this.value = value;
}

public double getValue() {
return value;
}

public abstract String getType();
}