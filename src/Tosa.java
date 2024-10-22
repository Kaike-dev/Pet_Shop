import java.time.LocalDate;

public class Tosa extends AbstractServico {
    private static final double[] PRECOS = {30.0, 40.0, 50.0}; // PEQUENO, MEDIO, GRANDE

    public Tosa(int codigo, LocalDate data, Animal animal) {
        super(codigo, data, animal);
    }

    @Override
    public void calcularPreco() {
        int tamanhoIndex = animal.getTamanho().ordinal();
        preco = PRECOS[tamanhoIndex];
    }

    @Override
    public String getTipoServico() {
        return "Tosa";
    }
}