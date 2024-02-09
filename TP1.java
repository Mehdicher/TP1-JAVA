import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int secretNumber = 67;
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.print("Devinez le nombre secret (entre 1 et 100) : ");
            int guess = scanner.nextInt();
            
            if (guess > secretNumber) {
                System.out.println("Le nombre que vous avez saisi est supérieur au nombre secret.");
            } else if (guess < secretNumber) {
                System.out.println("Le nombre que vous avez saisi est inférieur au nombre secret.");
            } else {
                System.out.println("Bravo, vous avez gagné le jeux");
                break; 
            }
        }
        
        scanner.close();
	}
}
