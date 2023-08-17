import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;


        System.out.println("Digite o número da agência:");
        agencia = sc.nextLine();
        System.out.println("Digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o seu nome:");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();


        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco."
                +"\nO número da sua agencia é "+agencia
                +"\nO número da sua conta é "+numero
                +"\nSeu saldo é de: R$"+saldo);
    }
}
