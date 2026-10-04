import java.util.Locale;

public class Atividade3 {

    // Método que aplica o Insertion Sort em ordem DECRESCENTE por nota
    public static void insertionSortDecrescente(Aluno[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            Aluno chave = vetor[i];
            int j = i - 1;

            // Para ordem DECRESCENTE, move os elementos com NOTA MENOR que a chave para a direita
            while (j >= 0 && vetor[j].getNota() < chave.getNota()) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        // Criando um vetor de teste com alunos
        Aluno[] alunos = {
                new Aluno("Ana", 7.5),
                new Aluno("Carlos", 9.0),
                new Aluno("Beatriz", 6.8),
                new Aluno("Daniel", 8.2),
                new Aluno("Eduarda", 9.5)
        };

        System.out.println("--- Vetor Original ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // Aplicando a ordenação
        insertionSortDecrescente(alunos);

        System.out.println("\n--- Vetor Ordenado (Decrescente por Nota) ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}