/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author audranmalosse
 * 
 * La classe Livre représente un livre avec un numéro unique, un titre, un nombre de pages et un auteur.
 * Il y a également un champ statique pour stocker le dernier numéro attribué à un livre.
 */
public class Livre {

    private int NumLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    private static AtomicInteger dernierNum;
    
    /**
     * Initialise le champ statique dernierNum avec la valeur 0.
     */
    static {
        dernierNum = new AtomicInteger(0);
    }
    /**
     * Constructeur qui prend en paramètre le titre, le nombre de pages et 
     * l'auteur du livre.
     * Il initialise également le numéro du livre en utilisant l'objet 
     * AtomicInteger pour générer un numéro unique.
     */
    public Livre(String titre, int nbPages, Personne auteur) {
        this.setTitre(titre);
        this.setNombreDePages(nbPages);
        this.setAuteur(auteur);
        this.setNumLivre(dernierNum.incrementAndGet());
    }
    
    /**
     * Retourne le numéro du livre.
     * 
     * @return le numéro du livre
     */
    public int getNumLivre() {
        return NumLivre;
    }
    
    /**
     * Retourne le titre du livre.
     * 
     * @return le titre du livre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Retourne le nombre de pages du livre.
     * 
     * @return le nombre de pages du livre
     */
    public int getNombreDePages() {
        return nombreDePages;
    }

    /**
     * Retourne l'auteur du livre.
     * 
     * @return l'auteur du livre
     */
    public Personne getAuteur() {
        return auteur;
    }

    /**
     * Retourne le dernier numéro attribué à un livre.
     * 
     * @return le dernier numéro attribué à un livre
     */
    public static int getDernierNum() {
        return dernierNum.get();
    }

    /**
     * Met à jour le numéro du livre.
     * 
     * @param NumLivre le nouveau numéro du livre
     */
    public void setNumLivre(int NumLivre) {
        this.NumLivre = NumLivre;
    }

    /**
     * Met à jour le titre du livre.
     * 
     * @param titre le nouveau titre du livre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
    * Met à jour le nombre de pages du livre.
    * 
    * @param nombreDePages le nouveau nombre de pages du livre
    */
    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    /**
    * Met à jour l'auteur du livre.
    * 
    * @param auteur le nouvel auteur du livre
    */
    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    /**
    * Retourne une chaîne de caractères contenant les informations sur le livre, telles que le numéro, le titre, l'auteur et le nombre de pages.
    * 
    * @return une chaîne de caractères contenant les informations sur le livre
    */
    public String toString() {
        return this.getNumLivre() + ", "
                + this.getTitre() + ", "
                + this.auteur.getPrenom() + " "
                + this.auteur.getNom() + ", "
                + this.getNombreDePages() + "p.";
    }
}
