import java.util.Scanner;

public class Principal {
    // O metodo override é usado em algumas classes para sobrescrever algum método
    // Garantindo que o método esta sendo sobrescrito e não criado um novo método
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // Menu do Cofrinho utilizando DO WHILE e SWITCH CASE
        do {
            System.out.println("\n=== MENU DO COFRINHO ===");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Quantia de uma Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total Convertido para Real");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de moeda (1-Real, 2-Dolar, 3-Euro):");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    switch (tipo) {
                        // Dependendo do valor que o usuário digitar, ele irá adicionar a moeda correspondente
                        // ao cofre, utilizando o método adicionarMoeda da classe Cofrinho.
                        case 1:
                            cofrinho.adicionarMoeda(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(new Euro(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    break;
                case 2:
                //Remove a quantia de uma moeda do tipo especificado, se possível.
                    System.out.println("Digite o tipo de moeda para remover a quantia (1-Real, 2-Dolar, 3-Euro):");
                    int tipoRemover = scanner.nextInt();
                    System.out.print("Digite a quantia a ser removida: ");
                    double valorRemover = scanner.nextDouble();
                    String tipoStr = "";
                    switch (tipoRemover) {
                        case 1:
                            tipoStr = "Real";
                            break;
                        case 2:
                            tipoStr = "Dólar";
                            break;
                        case 3:
                            tipoStr = "Euro";
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    if (!tipoStr.isEmpty()) {
                        cofrinho.removerValorMoeda(tipoStr, valorRemover);
                    }
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    double total = cofrinho.totalConvertidoParaReal();
                    System.out.printf("Total convertido para Real: R$ %.2f\n", total);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
