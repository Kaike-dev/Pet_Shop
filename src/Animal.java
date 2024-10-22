public class Animal {
    public enum Tamanho { PEQUENO, MEDIO, GRANDE }

    private Tamanho tamanho;

    public Animal(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}