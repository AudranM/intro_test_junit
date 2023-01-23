/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author p2200327
 */
public class Personne {
    
    private int numeroPers, anNaissance;
    private String nomPers, prenomPers;
    private static AtomicInteger dernierNumero;
    
    static {
        dernierNumero = new AtomicInteger(1);
    }
    
    public Personne(String nom, String prenom, int anneeNaissance){
        this.setNomPers(nom);
        this.setPrenomPers(prenom);
        this.setAnNaissance(anneeNaissance);
        this.numeroPers = dernierNumero.getAndIncrement();
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
    public static int getDernierNum(){
        
        return dernierNumero.get();
    }
    
    public int getNumero(){
        
        return numeroPers;
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
        
        return this.getNumero()+", "+this.getNom()+", "+this.getPrenom()+", "+this.getAnNaissance();
    }
   
}
