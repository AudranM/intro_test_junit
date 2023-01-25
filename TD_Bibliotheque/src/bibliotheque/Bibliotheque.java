/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;
import java.util.*;

/**
 *
 * @author audranmalosse
 */

public class Bibliotheque {
    
    private List<Livre> bibliotheque;
    private Iterator<Livre> iter;
    
    public Bibliotheque (){
        bibliotheque = new ArrayList();
    }
    
    public void ajouter (Livre l){
        bibliotheque.add(l);
    }
    
    public boolean livreAppartient(Livre l){
        return bibliotheque.contains(l);
    }
    
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
