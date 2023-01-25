/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 * ExceptionAuteur est une classe qui hérite d'Exception et qui est utilisée pour 
 * lancer des exceptions lorsqu'aucun livre de cet auteur n'est trouvé
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
