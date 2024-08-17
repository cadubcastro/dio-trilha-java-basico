import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário

        System.out.print("Por favor, digite o número da agência: ");

        // Obter pela scanner os valores digitados no terminal

        String numeroAgencia = scanner.next();

        System.out.print("Digite o nome do cliente: ");

        String nomeCliente = scanner.next();

        System.out.print("Digite o número da conta: ");

        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");

        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,  sua agência é " + numeroAgencia + ", conta " + numeroConta +
            " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}