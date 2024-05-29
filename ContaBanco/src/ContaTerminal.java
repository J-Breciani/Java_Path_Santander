import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor,digite o número da Agência !");
        int n_agencia = scanner.nextInt();

        System.out.println("Por favor, informe a agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o nome do cliente !");
        String nome = scanner.next();

        System.out.println("Agora informe o saldo da conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + 
        " conta " + n_agencia + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
