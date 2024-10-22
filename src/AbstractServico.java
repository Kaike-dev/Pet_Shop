import java.time.LocalDate;

public abstract class AbstractServico implements Servico {
    protected int codigo;
    protected LocalDate data;
    protected Animal animal;
    protected double preco;

    public AbstractServico(int codigo, LocalDate data, Animal animal) {
        this.codigo = codigo;
        this.data = data;
        this.animal = animal;
        this.preco = 0.0;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getTipoServico();
}