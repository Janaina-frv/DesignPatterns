package src.Criacionais.FactoryMethod;

public class NotaProvaFactory extends NotaFactory {
@Override
public Nota criarNota(double value) {
    return new NotaProva(value);
}
}

