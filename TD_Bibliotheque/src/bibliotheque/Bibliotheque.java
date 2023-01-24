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
    
    public String rechercheAuteur(String nom, String prenom){
        return "à implémenter";
    }    
    
    public String rechercheTitre(String titre){
        return "à implémenter";
    }
    
    public String toString (){
        return "à implémenter";
    }
}
