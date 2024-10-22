import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<AbstractServico> servicos;

    public Inventario() {
        servicos = new ArrayList<>();
    }

    public void adicionarServico(AbstractServico servico) {
        servico.calcularPreco();
        servicos.add(servico);
    }

    public void gerarRelatorio() {
        double totalRecebido = 0;
        for (AbstractServico servico : servicos) {
            System.out.printf("Código: %d, Data: %s, Serviço: %s, Preço: R$%.2f%n",
                    servico.codigo, servico.data, servico.getTipoServico(), servico.getPreco());
            totalRecebido += servico.getPreco();
        }
        System.out.printf("Total recebido: R$%.2f%n", totalRecebido);
    }
}