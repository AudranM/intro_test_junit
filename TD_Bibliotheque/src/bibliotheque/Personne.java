/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * La classe Personne permet de créer des objets P ersonne possédant un numéro,
 * un nom, un prénom et une année de naissance.
 *
 * @author p2200327
 */
public class Personne {

    private int numeroPers, anNaissance;
    private String nomPers, prenomPers;
    private static AtomicInteger dernierNumero;

    static {
        dernierNumero = new AtomicInteger(0);
    }

    /**
     * Constructeur de la classe Personne
     *
     * @param nom le nom de la personne
     * @param prenom le prénom de la personne
     * @param anneeNaissance l'année de naissance de la personne
     */
    public Personne(String nom, String prenom, int anneeNaissance) {
        this.setNomPers(nom);
        this.setPrenomPers(prenom);
        this.setAnNaissance(anneeNaissance);
        this.numeroPers = dernierNumero.incrementAndGet();
    }

    //SETTERS
    /**
     * Cette méthode permet de définir le numéro de la personne
     *
     * @param numero le numéro de la personne (int)
     */
    public void setNumPers(int numero) {
        this.numeroPers = numero;
    }

    /**
     * Cette méthode permet de définir le nom de la personne
     *
     * @param nom le nom de la personne
     */
    public void setNomPers(String nom) {
        this.nomPers = nom;
    }

    /**
     * Cette méthode permet de définir le prénom de la personne
     *
     * @param prenom le prénom de la personne
     */
    public void setPrenomPers(String prenom) {
        this.prenomPers = prenom;
    }

    /**
     * Cette méthode permet de définir l'année de naissance de la personne
     *
     * @param annee l'année de naissance de la personne
     */
    public void setAnNaissance(int annee) {
        this.anNaissance = annee;
    }

    //GETTERS
    /**
     * Cette méthode retourne le dernier numéro affecté
     *
     * @return le dernier numéro affecté
     */
    public static int getDernierNum() {

        return dernierNumero.get();
    }

    /**
     * Cette méthode retourne le numéro de la personne
     *
     * @return le numéro de la personne
     */
    public int getNumero() {

        return numeroPers;
    }

    /**
     * Cette méthode retourne le nom de la personne
     *
     * @return le nom de la personne
     */
    public String getNom() {

        return nomPers;
    }

    /**
     * Cette méthode retourne le prénom de la personne
     *
     * @return le prénom de la personne
     */
    public String getPrenom() {

        return prenomPers;
    }

    /**
     * Cette méthode retourne l'année de naissance de la personne
     *
     * @return l'année de naissance de la personne
     */
    public int getAnNaissance() {

        return anNaissance;
    }

    /**
     * Cette méthode retourne une représentation textuelle de la personne
     *
     * @return une représentation textuelle de la personne
     */
    @Override
    public String toString() {

        return this.getNumero() + ", " + this.getNom() + ", " + this.getPrenom() + ", " + this.getAnNaissance();
    }

}
