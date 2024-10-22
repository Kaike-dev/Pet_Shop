import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Registrar um banho para um cachorro pequeno com pelo longo
        Animal animalBanho = new Animal(Animal.Tamanho.PEQUENO);
        Banho banho = new Banho(1, LocalDate.now(), animalBanho, Banho.TipoPelo.LONGO);
        inventario.adicionarServico(banho);

        // Registrar uma hospedagem para um cachorro médio por 3 horas
        Animal animalHotel = new Animal(Animal.Tamanho.MEDIO);
        Hotelzinho hotelzinho = new Hotelzinho(2, LocalDate.now(), animalHotel, 3);
        inventario.adicionarServico(hotelzinho);

        // Registrar uma tosa para um cachorro grande
        Animal animalTosa = new Animal(Animal.Tamanho.GRANDE);
        Tosa tosa = new Tosa(3, LocalDate.now(), animalTosa);
        inventario.adicionarServico(tosa);

        // Gerar relatório
        inventario.gerarRelatorio();
    }
}