import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade =  scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura =  scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println(idade + " anos de idade.");
        System.out.println(altura + " cm de altura.");

        
        /**String nome = args[0];
        String sobrenome = args[1];
        int idade =  Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
        **/
    }
}
