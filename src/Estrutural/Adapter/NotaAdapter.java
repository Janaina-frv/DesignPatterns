package src.Estrutural.Adapter;

public class NotaAdapter implements Nota {
private EmissorNotasExternos externalGrade;

public NotaAdapter(EmissorNotasExternos externalGrade) {
   this.externalGrade = externalGrade;
}

@Override
public double getValue() {
   return externalGrade.getNota();
}

@Override
public String getTipoNota() {
   return externalGrade.getNotaDescricao();
}
}