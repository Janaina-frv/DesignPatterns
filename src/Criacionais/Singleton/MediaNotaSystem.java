package src.Criacionais.Singleton;

public class MediaNotaSystem {
    // Instância única da classe GradeSystem
    private static MediaNotaSystem instance;

    // Construtor privado para evitar instanciação externa
    private MediaNotaSystem() {
        // Inicialização dos dados do sistema de notas
    }

    // Método público estático que retorna a única instância da classe
    public static synchronized MediaNotaSystem getInstance() {
        if (instance == null) {
            instance = new MediaNotaSystem();
        }
        return instance;
    }

    // Métodos para gerenciar as notas dos alunos
    public void addGrade(String studentId, double grade) {
        // Lógica para adicionar uma nota para um aluno
    }

    public double getAverageGrade(String studentId) {
        // Lógica para calcular a média das notas de um aluno
        return 0.0;
    }
// Outros métodos necessários para o sistema de notas
}