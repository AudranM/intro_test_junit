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
    
    public Personne(String nom, String prenom, int anneeNaissance){
        this.setNomPers(nom);
        this.setPrenomPers(prenom);
        this.setAnNaissance(anneeNaissance);
    }
    
    //SETTERS
    public void setNumPers(int numero){
        this.numeroPers = numero;
    }
    
    public void setNomPers(String nom){
        this.nomPers = nom;
    }
    
    public void setPrenomPers(String prenom){
        this.prenomPers = prenom;
    }
    
    public void setAnNaissance(int annee){
        this.anNaissance = annee;
    }
    
    //GETTERS
    public int getDernierNum(){
        
        return 0;
    }
    
    public int getNumero(){
        
        return -1;
    }
    
    public String getNom(){
        
        return nomPers;
    }
    
    public String getPrenom(){
        
        return prenomPers;
    }
    
    public int getAnNaissance(){
        
        return anNaissance;
    }
    
    @Override
    public String toString(){
        
        return this.getNom()+", "+this.getPrenom()+", "+this.getAnNaissance();
    }
   
}
