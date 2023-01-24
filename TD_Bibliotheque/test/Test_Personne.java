/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import bibliotheque.Personne;
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
public class Test_Personne {
    
    private static Personne alan;
    private static Personne alan2;

    public Test_Personne() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        alan = new Personne("Turing", "Alan", 1912);
        alan2 = new Personne("Turing2", "Alan2", 1913);
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
     * Test of getNumero method, of class Personne.
     */
    
    @Test
    public void testGetNumero() {
        assertEquals(1, alan.getNumero());
    }

    /**
     * * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test of getDernierNum method, of class Personne.
     */

    @Test
    public void testGetDernierNum() {
        assertEquals(3,Personne.getDernierNum());
    }

    /**
     * Test of setNumPers method, of class Personne.
     */

    @Test
    public void testSetNumPers() {
        alan2.setNumPers(18);
        assertEquals(18, alan2.getNumero());
    }

    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        alan2.setNomPers("Minsky");
        assertEquals("Minsky", alan2.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class
     */
    @Test
    public void testSetPrenomPers() {

        alan2.setPrenomPers("Marvin");
        assertEquals("Marvin", alan2.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        alan2.setAnNaissance(1990);
        assertEquals(1990, alan2.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        assertEquals("1, Turing, Alan, 1912", alan.toString());
    }
}
