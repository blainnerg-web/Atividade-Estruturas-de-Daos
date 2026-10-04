import java.util.Arrays;
public class Atividade2 {

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        // Laço externo: define a posição 'i' que receberá o menor valor da rodada
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            // Laço interno: busca o menor elemento na sublista não ordenada
            for (int j = i + 1; j < n; j++) {
                comparacoes++; // Incrementa a cada comparação de elementos
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Realiza no máximo 1 troca por passagem
            if (indiceMenor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;

                trocas++; // Incrementa apenas quando a troca é realizada
            }
        }

        System.out.println("Comparações realizadas: " + comparacoes);
        System.out.println("Trocas realizadas: " + trocas);
    }

    public static void main(String[] args) {
        int[] numeros = {20, 10, 13, 14, 15, 18, 2, 1};

        System.out.println("Vetor original: " + Arrays.toString(numeros));
        System.out.println("----------------------------------------");

        selectionSort(numeros);

        System.out.println("----------------------------------------");
        System.out.println("Vetor ordenado: " + Arrays.toString(numeros));
    }
}