package src.Estrutural.Adapter;

public class Main {

public static void main(String[] args) {
  // Instanciando a classe da biblioteca externa
  EmissorNotasExternos externalGrade = new EmissorNotasExternos(85);

  // Usando o Adapter para integrar com o nosso sistema
  Nota nota = new NotaAdapter(externalGrade);

  // Utilizando os métodos da interface Nota
  System.out.println("Nota: " + nota.getValue());
  System.out.println("Descrição da Nota: " + nota.getTipoNota());
}

}