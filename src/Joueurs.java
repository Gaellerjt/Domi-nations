import java.util.Scanner;

public class Joueurs {
    public static void nmbDeJoueurs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nombre de joueurs");
        int nmbJoueurs = scanner.nextInt();
        scanner.nextLine();
        while (nmbJoueurs < 2 || nmbJoueurs > 4){
            System.out.println("Vous n'êtes pas le bon nombre de joueurs, veuillez ressaisir");
            nmbJoueurs = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        nmbDeJoueurs();
    }


}
