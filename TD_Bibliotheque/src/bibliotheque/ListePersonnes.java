package bibliotheque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author lucas
 */
public class ListePersonnes {

    private List<Personne> registre;
    private Iterator<Personne> iter ;

    public ListePersonnes() {
        registre = new ArrayList();
    }

    public void ajouter(Personne p) {
        registre.add(p);
    }

    public boolean personneAppartient(Personne p) {
        return registre.contains(p);
    }

    public boolean nomPrenomAppartient(String nom, String prenom) {
        iter = registre.iterator();
        while (iter.hasNext()){
            Personne p = iter.next();
            if (p.getNom().equals(nom) && p.getPrenom().equals(prenom))
                return true;
        }
        return false;
    }
    
    public String toString(){
        iter = registre.iterator();
        String res = "";
        while (iter.hasNext()){
            Personne p = iter.next();
            res += p.toString() + "\n";
        }
        return res;
    }
}
