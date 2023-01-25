/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 * Cette classe étend la classe Exception et représente une exception d'auteur.
 * 
 * @author audranmalosse
 */
public class ExceptionAuteur extends Exception {

    /**
     * Constructeur qui prend un message en paramètre
     * 
     * @param message Le message à afficher
     */
    public ExceptionAuteur(String message) {
        super(message);
    }
    
}
