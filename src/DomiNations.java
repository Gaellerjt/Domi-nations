import java.util.Scanner;

public class DomiNations {
    public static void regleDuJeu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de joueurs");
        int nmbJoueurs = scanner.nextInt();
        scanner.nextLine();
        if (nmbJoueurs ==2){

        }
        else if (2 < nmbJoueurs && nmbJoueurs < 5) {

        }
        else if (nmbJoueurs > 4){
            System.out.println("Erreur, vous êtes trop nombreux");
        }
        else if (nmbJoueurs < 2){
            System.out.println("Erreur, vous n'êtes pas assez");
        }
    }


}
