package src.Criacionais.FactoryMethod;

public class NotaTrabalhoFactory extends NotaFactory {

    @Override
    public Nota criarNota(double value) {
        return new NotaTrabalho(value);
    }
}