package pro.ContaBancaria;
import java.util.Scanner;

class ContaTerminal {
    int num = 0;  // Número da conta
    String agency; // Agência
    String nameCustomer; // Nome do cliente
    double balance = 0; // Saldo da conta

    /**
     * Método de execução
     * @throws Exception Lança exceção genérica (pode ser especificada).
     */

    public static void main (String [] args) throws Exception{
        ContaTerminal conta= new ContaTerminal(); //Instância do objeto ContaTerminal 
        Scanner scanner = new Scanner(System.in);  // Scanner de leitura dos dados inseridos no terminal

        System.out.println("-----------------------------");
        System.out.println("Informe o número da conta: ");
        conta.num = scanner.nextInt();
        scanner.nextLine(); // Ocupa a linha restante para evitar problemas na próxima leitura de linha

        System.out.print("Informe a agência: ");
        conta.agency = scanner.nextLine();

        System.out.print("Informe o nome do cliente: ");
        conta.nameCustomer = scanner.nextLine();

        System.out.print("Informe o saldo da conta: ");
        conta.balance = scanner.nextDouble();

        System.out.println("-----------------------------");
        System.out.println("Informações da Conta:");
        System.out.println("Número: " + conta.num );
        System.out.println("Agência: " + conta.agency );
        System.out.println("Cliente: " + conta.nameCustomer );
        System.out.println("Saldo: R$" + conta.balance );

        // Fechamento do scanner 
        scanner.close();
    }
}