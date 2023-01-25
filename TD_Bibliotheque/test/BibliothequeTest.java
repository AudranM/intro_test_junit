/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bibliotheque.Personne;
import bibliotheque.ListePersonnes;
import bibliotheque.Livre;
import bibliotheque.Bibliotheque;
import bibliotheque.ExceptionAuteur;
import bibliotheque.ExceptionTitre;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
/**
 *
 * @author audranmalosse
 */
public class BibliothequeTest {

    private static Personne p1, p2, p3;
    private static Livre L1, L2;
    private static Bibliotheque biblio, biblio2;

    public BibliothequeTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        p1 = new Personne ("Tutu", "Toto", 1997);
        p2 = new Personne ("Watrigant", "Remi", 1901);
        L1 = new Livre("Tata", 250, p1);
        L2 = new Livre("Algo", 200, p2);
        biblio = new Bibliotheque();
        biblio2 = new Bibliotheque();
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
     * 
     */
    
    @Test
    public void testAjouter() {
        Livre test = new Livre("Algo", 200, p2);
        biblio.ajouter(test);
        assertEquals(true, biblio.livreAppartient(test));
    }
    
    /**
    * 
    */
    
    @Test
    public void testLivreAppartient() {
        Livre test = new Livre("Algo", 200, p2);
        biblio.ajouter(test);
        assertEquals(true, biblio.livreAppartient(test));
    }
    
    /**
    * 
    */
    @Test
    public void testRechercheAuteur() {
        try{
            Personne p3 = new Personne("Nouvel", "Auteur", 2010);
            Livre livreTest = new Livre("Algo", 200, p3);
            Bibliotheque biblioTest = new Bibliotheque ();
            biblioTest.ajouter(livreTest);
            biblio.ajouter(livreTest);
            assertEquals(biblioTest.toString(), biblio.rechercheAuteur("Nouvel", "Auteur").toString());
        }
        catch(ExceptionAuteur e){
            fail("Erreur lors de la recherche Auteur");
        }
    }
    
    /**
    * 
    */
    @Test
    public void testRechercheTitre() {
        try{
            Livre livreTest2 = new Livre("LeNouveauTitre", 200, p2);
            Bibliotheque biblioTest2 = new Bibliotheque ();
            biblioTest2.ajouter(livreTest2);
            biblio.ajouter(livreTest2);
            assertEquals(biblioTest2.toString(), biblio.rechercheTitre("LeNouveauTitre").toString());
        }
        
        catch(ExceptionTitre e){
            fail("Erreur lors de la recherche de titre");
        }
    }    
    
    /**
     * 
     */
    @Test
    public void testToString() {
        biblio2.ajouter(L1);
        biblio2.ajouter(L2);
        assertEquals("1, Tata, Toto Tutu, 250p.\n2, Algo, Remi Watrigant, 200p.\n", biblio2.toString());
    }
    
}



