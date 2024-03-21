package v0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de rounds de la partie : ");
        int nb_rounds = scanner.nextInt();
        Monopoly jeu = new Monopoly(nb_rounds);
        jeu.jouer();
    }
}