/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 *
 * @author p2200327
 */
public class Personne {
    
    private int numeroPers, anNaissance;
    private String nomPers, prenomPers;
    private static int dernierNumero;
    
    Personne(String nom, String prenom, int anneeNaissance){
        
    }
    
    //SETTERS
    public void setNumPers(int numero){
        
    }
    
    public void setNomPers(String nom){
        
    }
    
    public void setPrenomPers(String prenom){
        
    }
    
    public void setAnNaissance(int annee){
        
    }
    
    //GETTERS
    public int getDernierNum(){
        
        return 0;
    }
    
    public int getNumero(){
        
        return 1;
    }
    
    public String getNom(){
        
        return nomPers;
    }
    
    public String getPrenom(){
        
        return prenomPers;
    }
    
    public int getAnNaissance(){
        
        return -1;
    }
    
    @Override
    public String toString(){
        
        return "rien";
    }
   
}
