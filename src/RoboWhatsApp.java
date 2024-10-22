import java.time.LocalDate;
import java.util.Scanner;

public class RoboWhatsApp {
    private Inventario inventario;
    private Scanner scanner;

    public RoboWhatsApp() {
        this.inventario = new Inventario();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        String opcao;

        System.out.println("Bem-vindo ao Petshop Robo! Como posso ajudar você hoje?");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Pedir banho");
            System.out.println("2. Pedir hotelzinho");
            System.out.println("3. Pedir tosa");
            System.out.println("4. Fechar loja");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    pedirBanho();
                    break;
                case "2":
                    pedirHotelzinho();
                    break;
                case "3":
                    pedirTosa();
                    break;
                case "4":
                    fecharLoja();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (!opcao.equals("4"));
    }

    private void pedirBanho() {
        System.out.print("Digite o código do serviço: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a data (yyyy-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Qual o tamanho do animal (PEQUENO, MEDIO, GRANDE)? ");
        Animal.Tamanho tamanho = Animal.Tamanho.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Qual o tipo de pelo (CURTO, MEDIO, LONGO)? ");
        Banho.TipoPelo tipoPelo = Banho.TipoPelo.valueOf(scanner.nextLine().toUpperCase());

        Animal animal = new Animal(tamanho);
        Banho banho = new Banho(codigo, data, animal, tipoPelo);
        inventario.adicionarServico(banho);

        System.out.printf("Serviço solicitado: Banho (%s) - Preço: R$%.2f%n", tipoPelo, banho.getPreco());
    }

    private void pedirHotelzinho() {
        System.out.print("Digite o código do serviço: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a data (yyyy-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Qual o tamanho do animal (PEQUENO, MEDIO, GRANDE)? ");
        Animal.Tamanho tamanho = Animal.Tamanho.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Quantas horas o animal ficará no hotelzinho? ");
        int horas = Integer.parseInt(scanner.nextLine());

        Animal animal = new Animal(tamanho);
        Hotelzinho hotelzinho = new Hotelzinho(codigo, data, animal, horas);
        inventario.adicionarServico(hotelzinho);

        System.out.printf("Serviço solicitado: Hotelzinho (%d horas) - Preço: R$%.2f%n", horas, hotelzinho.getPreco());
    }

    private void pedirTosa() {
        System.out.print("Digite o código do serviço: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a data (yyyy-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Qual o tamanho do animal (PEQUENO, MEDIO, GRANDE)? ");
        Animal.Tamanho tamanho = Animal.Tamanho.valueOf(scanner.nextLine().toUpperCase());

        Animal animal = new Animal(tamanho);
        Tosa tosa = new Tosa(codigo, data, animal);
        inventario.adicionarServico(tosa);

        System.out.printf("Serviço solicitado: Tosa - Preço: R$%.2f%n", tosa.getPreco());
    }

    private void fecharLoja() {
        System.out.println("\nFechando a loja...");
        inventario.gerarRelatorio();
        System.out.println("Loja fechada. Obrigado e até a próxima!");
        scanner.close();
    }

    public static void main(String[] args) {
        RoboWhatsApp roboWhatsApp = new RoboWhatsApp();
        roboWhatsApp.iniciar();
    }
}