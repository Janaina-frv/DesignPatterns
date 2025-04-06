package src.Estrutural.Adapter;

public class EmissorNotasExternos {
 private int score;

 public EmissorNotasExternos(int score) {
 this.score = score;
 }

 public int getNota() {
 return score;
 }

 public String getNotaDescricao() {
 if (score >= 90) return "A";
 else if (score >= 80) return "B";
 else if (score >= 70) return "C";
 else if (score >= 60) return "D";
 else return "F";
 }
}