import java.time.LocalDate;

public class Hotelzinho extends AbstractServico {
    private int horas;

    private static final double[] PRECOS = {12.0, 18.0, 25.0}; // PEQUENO, MEDIO, GRANDE

    public Hotelzinho(int codigo, LocalDate data, Animal animal, int horas) {
        super(codigo, data, animal);
        this.horas = horas;
    }

    @Override
    public void calcularPreco() {
        int tamanhoIndex = animal.getTamanho().ordinal();
        preco = horas * PRECOS[tamanhoIndex];
    }

    @Override
    public String getTipoServico() {
        return "Hotelzinho";
    }
}