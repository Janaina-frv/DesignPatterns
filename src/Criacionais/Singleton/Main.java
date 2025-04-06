package src.Criacionais.Singleton;

public class Main {

    public static void main(String[] args) {
        // Obtém a única instância do GradeSystem
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();

        // Adiciona notas para alunos
        mediaNotaSystem.addGrade("123", 95.0);
        mediaNotaSystem.addGrade("123", 85.0);

        // Calcula a média das notas de um aluno
        double average = mediaNotaSystem.getAverageGrade("123");
        System.out.println("Média do aluno 123: " + average);
    }
}