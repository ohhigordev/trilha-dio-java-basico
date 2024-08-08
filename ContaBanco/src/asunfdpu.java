import java.util.Scanner;

public class asunfdpu {
   

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome do titular da conta
        System.out.print("Insira o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        // Pedindo o número da conta
        System.out.print("Insira o número da conta: ");
        String numeroConta = scanner.nextLine();

        // Pedindo o saldo da conta
        System.out.print("Insira o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibindo os dados da conta bancária
        System.out.println("\nDados da Conta Bancária:");
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);

        // Fechando o scanner
        scanner.close();
    }
}

}
