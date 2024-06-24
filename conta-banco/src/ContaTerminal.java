import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da agencia !");
        agencia = scan.nextInt();
        System.out.println("Por favor, digite o numero da conta !");
        numeroConta = scan.nextInt();
        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scan.next();
        System.out.println("Por favor, digite o saldo disponivel !");
        saldo = scan.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + ", ja disponivel para o saque");


    }
}
