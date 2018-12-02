import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DomiNations {
    public static void regleDuJeu() {
        Color rouge = new Color(255 - 0 - 0);
        Color jaune = new Color(255 - 255 - 0);
        Color vert = new Color(34 - 139 - 34);
        Color bleu = new Color(0 - 191 - 255);
        Color marron = new Color(139 - 69 - 19);
        Color gris = new Color(190 - 190 - 190);
        Color rose = new Color (255-105-180);
        ArrayList<Tuiles> tuiles = new ArrayList<>();
        ArrayList<Chateau> chateau = new ArrayList<>();
        Tuiles domino1 = new Tuiles(0, jaune, 0, jaune, 1);
        tuiles.add(domino1);
        Tuiles domino2 = new Tuiles(0, jaune, 0, jaune, 2);
        tuiles.add(domino2);
        Tuiles domino3 = new Tuiles(0, rouge, 0, rouge, 3);
        tuiles.add(domino3);
        Tuiles domino4 = new Tuiles(0, rouge, 0, rouge, 4);
        tuiles.add(domino4);
        Tuiles domino5 = new Tuiles(0, rouge, 0, rouge, 5);
        tuiles.add(domino5);
        Tuiles domino6 = new Tuiles(0, rouge, 0, rouge, 6);
        tuiles.add(domino6);
        Tuiles domino7 = new Tuiles(0, bleu, 0, bleu, 7);
        tuiles.add(domino7);
        Tuiles domino8 = new Tuiles(0, bleu, 0, bleu, 8);
        tuiles.add(domino8);
        Tuiles domino9 = new Tuiles(0, bleu, 0, bleu, 9);
        tuiles.add(domino9);
        Tuiles domino10 = new Tuiles(0, vert, 0, vert, 10);
        tuiles.add(domino10);
        Tuiles domino11 = new Tuiles(0, vert, 0, vert, 11);
        tuiles.add(domino11);
        Tuiles domino12 = new Tuiles(0, gris, 0, gris, 12);
        tuiles.add(domino12);
        Tuiles domino13 = new Tuiles(0, jaune, 0, rouge, 13);
        tuiles.add(domino13);
        Tuiles domino14 = new Tuiles(0, jaune, 0, bleu, 14);
        tuiles.add(domino14);
        Tuiles domino15 = new Tuiles(0, jaune, 0, vert, 15);
        tuiles.add(domino15);
        Tuiles domino16 = new Tuiles(0, jaune, 0, gris, 16);
        tuiles.add(domino16);
        Tuiles domino17 = new Tuiles(0, rouge, 0, bleu, 17);
        tuiles.add(domino17);
        Tuiles domino18 = new Tuiles(0, rouge, 0, vert, 18);
        tuiles.add(domino18);
        Tuiles domino19 = new Tuiles(1, jaune, 0, rouge, 19);
        tuiles.add(domino19);
        Tuiles domino20 = new Tuiles(1, jaune, 0, bleu, 20);
        tuiles.add(domino20);
        Tuiles domino21 = new Tuiles(1, jaune, 0, vert, 21);
        tuiles.add(domino21);
        Tuiles domino22 = new Tuiles(1, jaune, 0, gris, 22);
        tuiles.add(domino22);
        Tuiles domino23 = new Tuiles(1, jaune, 0, marron, 23);
        tuiles.add(domino23);
        Tuiles domino24 = new Tuiles(1, rouge, 0, jaune, 24);
        tuiles.add(domino24);
        Tuiles domino25 = new Tuiles(1, rouge, 0, jaune, 25);
        tuiles.add(domino25);
        Tuiles domino26 = new Tuiles(1, rouge, 0, jaune, 26);
        tuiles.add(domino26);
        Tuiles domino27 = new Tuiles(1, rouge, 0, jaune, 27);
        tuiles.add(domino27);
        Tuiles domino28 = new Tuiles (1,rouge,0,bleu,28);
        tuiles.add(domino28);
        Tuiles domino29 = new Tuiles (1,rouge,0,vert,29);
        tuiles.add(domino29);
        Tuiles domino30 = new Tuiles (1,bleu,0,jaune,30);
        tuiles.add(domino30);
        Tuiles domino31 = new Tuiles (1,bleu,0,jaune,31);
        tuiles.add(domino31);
        Tuiles domino32 = new Tuiles (1,bleu,0,rouge,32);
        tuiles.add(domino32);
        Tuiles domino33 = new Tuiles (1,bleu,0,rouge,33);
        tuiles.add(domino33);
        Tuiles domino34 = new Tuiles (1,bleu,0,rouge,34);
        tuiles.add(domino34);
        Tuiles domino35 = new Tuiles (1,bleu,0,rouge,35);
        tuiles.add(domino35);
        Tuiles domino36 = new Tuiles (0,jaune,1,vert,36);
        tuiles.add(domino36);
        Tuiles domino37 = new Tuiles (0,bleu,1,vert,37);
        tuiles.add(domino37);
        Tuiles domino38 = new Tuiles (0,jaune,1,gris,38);
        tuiles.add(domino38);
        Tuiles domino39 = new Tuiles (0,vert,1,gris,39);
        tuiles.add(domino39);
        Tuiles domino40 = new Tuiles (1,marron,0,jaune,40);
        tuiles.add(domino40);
        Tuiles domino41 = new Tuiles(0,jaune,2,vert,41);
        tuiles.add(domino41);
        Tuiles domino42 = new Tuiles(0,bleu,2,vert,42);
        tuiles.add(domino42);
        Tuiles domino43 = new Tuiles (0,jaune,2,gris,43);
        tuiles.add(domino43);
        Tuiles domino44 = new Tuiles(0,vert,2,gris,44);
        tuiles.add(domino44);
        Tuiles domino45 = new Tuiles(2,marron,0,jaune,45);
        tuiles.add(domino45);
        Tuiles domino46 = new Tuiles(0,gris,2,marron,46);
        tuiles.add(domino46);
        Tuiles domino47 = new Tuiles(0,gris,2,marron,47);
        tuiles.add(domino47);
        Tuiles domino48 = new Tuiles(0,jaune,3,marron,48);
        tuiles.add(domino48);
        Chateau chateau1 = new Chateau(jaune);
        chateau.add(chateau1);
        Chateau chateau2 = new Chateau(vert);
        chateau.add(chateau2);
        Chateau chateau3 = new Chateau(bleu);
        chateau.add(chateau3);
        Chateau chateau4 = new Chateau(rose);
        chateau.add(chateau4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nombre de joueurs");
        int nmbJoueurs = scanner.nextInt();
        scanner.nextLine();
        while (nmbJoueurs < 2 || nmbJoueurs > 4){
            System.out.println("Vous n'êtes pas le bon nombre de joueurs, veuillez ressaisir");
            nmbJoueurs = scanner.nextInt();
        }

        if (nmbJoueurs == 2) {
            for (int i = 0; i<25;i++ ){
                tuiles.remove(Math.random() * 2);
            }
        }

        if (nmbJoueurs == 3) {
            for (int i = 0 ; i < 13 ; i ++) {
                tuiles.remove(Math.random()*2);
            }
        }




    }

}
