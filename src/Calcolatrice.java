import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Benvenuto nella calcolatrice!");
            System.out.println("Inserisci il primo numero:");
            double numero1 = scanner.nextDouble();

            System.out.println("Inserisci il secondo numero:");
            double numero2 = scanner.nextDouble();

            System.out.println("Scegli l'operazione da eseguire:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");

            int scelta = scanner.nextInt();

            double risultato = 0;

            switch (scelta) {
                case 1:
                    risultato = numero1 + numero2;
                    break;
                case 2:
                    risultato = numero1 - numero2;
                    break;
                case 3:
                    risultato = numero1 * numero2;
                    break;
                case 4:
                    risultato = numero1 / numero2;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }

            System.out.println("Il risultato dell'operazione è: " + risultato);
        }
    }
}

