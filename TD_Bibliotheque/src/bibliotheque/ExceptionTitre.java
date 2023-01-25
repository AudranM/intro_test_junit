/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 * ExceptionTitre est une classe qui hérite d'Exception et qui est utilisée pour 
 * lancer des exceptions lorsque le titre d'un élément est invalide.
 * 
 * @author audranmalosse
 */


public class ExceptionTitre extends Exception {
    
    /**
     * Constructeur de la classe ExceptionTitre.
     * 
     * @param message Message à afficher lorsque l'exception est lancée.
     */
    public ExceptionTitre(String message) {
        super(message);
    }
    
}
