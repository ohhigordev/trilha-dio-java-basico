import java.util.Scanner;


public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Primeiro vamos pedir as informações ao usuário:
        System.out.print("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();


        // Exibindo os dados da conta bancaria:
        System.out.println("\n");
        System.out.println("\nDados da conta");
        System.out.println("Nome do Titular: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo:  R$" + saldo);

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponivel para saque!");


        scanner.close();

    }
}