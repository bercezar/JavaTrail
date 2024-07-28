package pro.ContaBancaria;
import java.util.Scanner;

class ContaTerminal {
    int num = 0;
    String agency;
    String nameCustomer;
    double balance = 0;
    public static void main (String [] args) throws Exception{
        ContaTerminal conta= new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Informe o número da conta: ");
        conta.num = scanner.nextInt();
        scanner.nextLine();

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
        scanner.close();
    }
}