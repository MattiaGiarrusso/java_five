
import java.util.Scanner; //importare java.util.scanner

public class App {
    public static void main(String[] args) {
        // creare un oggetto scanner 
        Scanner scanner = new Scanner(System.in);
        
        // creare domande per l'utente 
        System.out.println("Qual è il tuo nome?");
        String name = scanner.nextLine();
        System.out.println("Qual è il tuo cognome?");
        String lastname = scanner.nextLine();

        System.out.println("Ciao " + name + " " + lastname);

        System.out.println("Qual è la tua età?");
        int age = scanner.nextInt();

        System.out.println("Hai " + age + " anni, complimenti!");

        System.out.println("In che città vivi?");
        String city = scanner.nextLine();

        System.out.println("Vivi a " + city + ", bel posto!");

    }
}
