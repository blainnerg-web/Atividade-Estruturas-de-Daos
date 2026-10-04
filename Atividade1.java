import java.util.Arrays;

public class Atividade1 {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {

            boolean troca = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;

                    troca = true;
                }
            }

            if (!troca) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {20, 10, 13, 14, 15, 18, 2, 1};

        System.out.println("Vetor original: " + Arrays.toString(num));

        bubbleSort(num);

        System.out.println("Vetor ordenado: " + Arrays.toString(num));
    }
}