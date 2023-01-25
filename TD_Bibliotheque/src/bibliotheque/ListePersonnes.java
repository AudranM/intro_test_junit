package bibliotheque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 * La classe ListePersonnes permet de stocker des personnes dans une liste.
 *
 * @author lucas
 */
public class ListePersonnes {

    /**
     * @param registre ArrayList contenant des objets de type Personne
     * @param iter Iterator de registre
     */
    private final List<Personne> registre;
    private Iterator<Personne> iter;

    /**
     * Constructeur par défaut de ListePersonne
     */
    public ListePersonnes() {
        registre = new ArrayList();
    }

    /**
     * Cette méthode permet d'ajouter une personne à la liste
     *
     * @param p La personne à ajouter
     */
    public void ajouter(Personne p) {
        registre.add(p);
    }

    /**
     * Cette méthode permet de vérifier si une personne appartient à la liste en
     * utilisant une référence de type Personne
     *
     * @param p La personne à rechercher
     * @return true si la personne appartient à la liste, false sinon
     */
    public boolean personneAppartient(Personne p) {
        return registre.contains(p);
    }

    /**
     * Cette méthode permet de vérifier si une personne appartient à la liste en
     * utilisant son nom et son prénom
     *
     * @param nom Le nom de la personne à rechercher
     * @param prenom Le prénom de la personne à rechercher
     * @return true si la personne appartient à la liste, false sinon
     */
    public boolean nomPrenomAppartient(String nom, String prenom) {
        iter = registre.iterator();
        while (iter.hasNext()) {
            Personne p = iter.next();
            if (p.getNom().equals(nom) && p.getPrenom().equals(prenom)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Cette méthode retourne la liste sous forme de String
     *
     * @return le contenu de la liste
     */
    @Override
    public String toString() {
        iter = registre.iterator();
        String res = "";
        while (iter.hasNext()) {
            Personne p = iter.next();
            res += p.toString() + "\n";
        }
        return res;
    }
}
