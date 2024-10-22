import java.time.LocalDate;

public class Banho extends AbstractServico {
    public enum TipoPelo { CURTO, MEDIO, LONGO }

    private static final double[][] PRECOS = {
            {50.0, 65.0, 75.0}, // PEQUENO
            {60.0, 75.0, 85.0}, // MEDIO
            {70.0, 85.0, 95.0}  // GRANDE
    };

    private TipoPelo tipoPelo;

    public Banho(int codigo, LocalDate data, Animal animal, TipoPelo tipoPelo) {
        super(codigo, data, animal);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public void calcularPreco() {
        int tamanhoIndex = animal.getTamanho().ordinal();
        int tipoPeloIndex = tipoPelo.ordinal();
        preco = PRECOS[tamanhoIndex][tipoPeloIndex];
    }

    @Override
    public String getTipoServico() {
        return "Banho";
    }
}