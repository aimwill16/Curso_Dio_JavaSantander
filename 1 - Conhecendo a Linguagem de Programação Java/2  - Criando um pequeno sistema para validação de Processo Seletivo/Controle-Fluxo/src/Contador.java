import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro parametro (inteiro):");
        a = sc.nextInt();
        System.out.println("Digite o segundo parametro (inteiro):");
        b = sc.nextInt();

        try {
            if (a > b) {
                throw new ParametrosInvalidosException("O primeiro parametro não pode ser maior que o segundo.");
            } else {
                if (a < b) {
                    while (a < b) {
                        System.out.println("Imprimindo o numero: " + a);
                        a++;
                    }
                }
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
