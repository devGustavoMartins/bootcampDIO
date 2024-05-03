import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

        sc.close();
    }
}
