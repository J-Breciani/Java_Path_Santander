import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero1 = 1;
        String numero2 = "2";
        System.out.println(numero1+numero2); 

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos, e tenho " + altura + " metros de altura.");

        scanner.close();
}
}