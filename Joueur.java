package v0;

class Joueur {
    private String nom;
    private int position;

    public Joueur(String nom) {
        this.nom = nom;
        this.position = 0;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPosition() {
        return this.position;
    }

    public void deplacement(int de) {
        this.position += de;
    }
}