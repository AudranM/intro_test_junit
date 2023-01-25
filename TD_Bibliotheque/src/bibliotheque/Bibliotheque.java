/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;
import java.util.*;

/**
 * La classe Bibliothèque représente une collection de livres
 * 
 * @author audranmalosse
 */

public class Bibliotheque {
    
    /**
     * La liste des livres dans la bibliothèque
     */
    private final List<Livre> bibliotheque;
     /**
     * L'itérateur sur la Bibliothèque
     */
    private Iterator<Livre> iter;
    
    /**
     * Constructeur par défaut de la classe Bibliothèque
     */
    public Bibliotheque (){
        bibliotheque = new ArrayList();
    }
    
    /**
     * Ajoute un livre à la bibliothèque
     * @param l le livre à ajouter
     */
    public void ajouter (Livre l){
        bibliotheque.add(l);
    }
    
     /**
     * Vérifie si un livre est présent dans la bibliothèque
     * @param l le livre à rechercher
     * @return vrai si le livre est présent, faux sinon
     */
    public boolean livreAppartient(Livre l){
        return bibliotheque.contains(l);
    }
    
    /**
     * Recherche les livres d'un auteur donné
     * @param nom le nom de l'auteur
     * @param prenom le prénom de l'auteur
     * @return la bibliothèque des livres trouvés
     * @throws ExceptionAuteur si aucun livre de cet auteur n'est trouvé
     */
    public Bibliotheque rechercheAuteur(String nom, String prenom) throws ExceptionAuteur{
        iter = bibliotheque.iterator();
        Bibliotheque res = new Bibliotheque();
        while (iter.hasNext()){
            Livre l = iter.next();
            if(l.getAuteur().getNom().equals(nom) && 
                    l.getAuteur().getPrenom().equals(prenom)){
                res.ajouter(l);
            }    
            
        }
        if (res.bibliotheque.isEmpty())
            throw new ExceptionAuteur("Pas de livre de cet auteur trouvé");
        return res;
    }
    
     /**
     * Recherche les livres portant un titre donné
     * @param titre le titre à rechercher
     * @return la bibliothèque des livres trouvés
     * @throws ExceptionTitre si aucun livre portant ce titre n'est trouvé
     */
    public Bibliotheque rechercheTitre(String titre) throws ExceptionTitre{
        iter = bibliotheque.iterator();
        Bibliotheque res = new Bibliotheque();
        while (iter.hasNext()){
            Livre l = iter.next();
            if(l.getTitre().equals(titre)){
                res.ajouter(l);
            }    
            
        }
        if (res.bibliotheque.isEmpty())
            throw new ExceptionTitre("Pas de livre avec ce titre trouvé");
        return res;
    }
    /**
     * Affiche les informations sur les livres de la bibliothèque
     * @return la chaîne de caractères contenant les informations sur les livres
     */
    @Override
    public String toString (){
        iter = bibliotheque.iterator();
        String res = "";
        while (iter.hasNext()){
            Livre p = iter.next();
            res += p.toString() + "\n";
        }
        return res;
    }
}
