/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import bibliotheque.Personne;
import bibliotheque.ListePersonnes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


/**
 *Réponse Question 3 du TP:
 * 1- Lors de l'ajout de @Ignore, NetBeans nous propose l'import de org.junit.Ignore.
 * 2- Cela permet de skip le test et de ne pas retourner d'erreurs mais cela ne 
 * valide pas le test global à 100% pour autant.
 * 
 * Réponse Question 4 du TP :
 * 1-Les différentes sont : utiliser un compteur statique pour set le numéro de 
 * personne à sa création puis incrémenter le compteur OU utiliser AtomicInteger
 * 2- L'avantage du compteur statique est que Personne ne dépend pas d'une autre
 * classe, l'inconvénient est que si on veut ajouter un numéro à la classe Livre
 * aussi on va dupliquer du code. L'avantage d'AtomicInteger est qu'il évite la 
 * duplication de code si on veut ajouter aussi un numéro à la Classe Livre. 
 * L'inconvénient est qu'il y a maintenant un couplage entre nos classes et 
 * AtomicInteger (toutefois AtomicInteger est stable).
 * 
 */
/**
 *
 * @author audranmalosse
 */
public class Test_ListePersonnes {

    private static ListePersonnes liste1;
    private static ListePersonnes liste2;

    public Test_ListePersonnes() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        liste1 = new ListePersonnes();
        liste2 = new ListePersonnes();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Test of ajouter method, of class ListePersonne.
     */
    
    @Test
    public void testAjouter() {
        Personne alan2 = new Personne("Turing2", "Alan2", 1913);
        liste1.ajouter(alan2);
        assertEquals(true, liste1.personneAppartient(alan2));
    }
    
     /**
     * Test of personneAppartient method, of class ListePersonne.
     */
    
    @Test
    public void testPersonneAppartient() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        liste1.ajouter(alan);
        assertEquals(true, liste1.personneAppartient(alan));
    }
    
     /**
     * Test of personneAppartient method, of class ListePersonne.
     */
    
    @Test
    public void testNomPrenomAppartient() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        liste1.ajouter(alan);
        assertEquals(true, liste1.nomPrenomAppartient("Turing", "Alan"));
    }

    /**
     * Test of toString method, of class ListePersonnes.
     */
    @Test
    public void testToString() {
        Personne alan3 = new Personne("Turing3", "Alan3", 1914);
        Personne alan4 = new Personne("Turing4", "Alan4", 1919);
        liste2.ajouter(alan3);
        liste2.ajouter(alan4);
        assertEquals("3, Turing3, Alan3, 1914\n4, Turing4, Alan4, 1919\n", liste2.toString());
    }
}

