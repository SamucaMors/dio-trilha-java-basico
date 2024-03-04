import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nomeCliente = read.nextLine();

        System.out.print("Digite o número da agência (exemplo: 123-45): ");
        String agencia = read.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = read.nextInt();

        System.out.print("Digite o seu saldo: ");
        double saldo = read.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo));
        //Fechando o scanner
        read.close();
    }
}
