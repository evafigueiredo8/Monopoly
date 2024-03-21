package v0;

import java.util.Scanner;


class Monopoly {
    private int nb_rounds;
    private Joueur[] joueurs;
    private int round;

    public Monopoly(int nb_rounds) {
        this.nb_rounds = nb_rounds;
        this.joueurs = new Joueur[]{new Joueur("Joueur 1"), new Joueur("Joueur 2")};
        this.round = 0;
    }

    public void round() {
        System.out.println("\nTour " + (this.round + 1));
        for (Joueur joueur : this.joueurs) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(joueur.getNom() + ", appuyez sur entrée pour lancer les dés...");
            scanner.nextLine();
            int lance_de = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
            joueur.deplacement(lance_de);
            System.out.println(joueur.getNom() + " a lancé les dés et avancé de " + lance_de + " cases.");
            System.out.println(joueur.getNom() + " est maintenant sur la case " + joueur.getPosition());
        }
    }

    public void jouer() {
        System.out.println("MONOPOLY");
        while (this.round < this.nb_rounds) {
            this.round();
            this.round++;
        }

        System.out.println("\nLa partie est terminée!");
        for (Joueur joueur : this.joueurs) {
            System.out.println(joueur.getNom() + " est sur la case " + joueur.getPosition());
        }
    }
}
