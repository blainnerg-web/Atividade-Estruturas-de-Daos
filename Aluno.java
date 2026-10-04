import java.util.Locale;

public class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Setters (opcionais, caso precise alterar os dados depois)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para exibir o aluno formatado
    @Override
    public String toString() {
        return String.format(Locale.US, "Aluno: %-10s | Nota: %.1f", nome, nota);
    }
}