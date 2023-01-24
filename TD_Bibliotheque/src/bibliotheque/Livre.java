/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author audranmalosse
 */
public class Livre {

    private int NumLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    private static AtomicInteger dernierNum;

    static {
        dernierNum = new AtomicInteger(0);
    }

    public Livre(String titre, int nbPages, Personne auteur) {
        this.setTitre(titre);
        this.setNombreDePages(nbPages);
        this.setAuteur(auteur);
        this.setNumLivre(dernierNum.incrementAndGet());
    }

    public int getNumLivre() {
        return NumLivre;
    }

    public String getTitre() {
        return titre;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public Personne getAuteur() {
        return auteur;
    }

    public static int getDernierNum() {
        return dernierNum.get();
    }

    public void setNumLivre(int NumLivre) {
        this.NumLivre = NumLivre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    public String toString() {
        return this.getNumLivre() + ", "
                + this.getTitre() + ", "
                + this.auteur.getPrenom() + " "
                + this.auteur.getNom() + ", "
                + this.getNombreDePages() + "p.";
    }
}
