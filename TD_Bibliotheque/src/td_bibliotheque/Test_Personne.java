/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author audranmalosse
 */
public class Test_Personne {

    public Test_Personne() {
    }

    @BeforeClass
    public static void setUpClass() {
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
        fail("Test à implémenter plus tard");
    }

    /**
     * * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test of getDernierNum method, of class Personne.
     */
    @Test
    public void testGetDernierNum() {
        fail("Test à implémenter plus tard");
    }

    /**
     * Test of setNumPers method, of class Personne.
     */
    @Test
    public void testSetNumPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setNumPers(18);
        assertEquals(18, alan.getNumero());
    }

    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne alan = new Personne("Turing","Alan", 1912);
        alan.setNomPers("Minsky");
        assertEquals("Minsky", alan.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class
     */
    @Test
    public void testSetPrenomPers() {

    Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setPrenomPers("Marvin");
        assertEquals("Marvin", alan.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setAnNaissance(1990);
        assertEquals(1990, alan.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing, Alan, 1912", alan.toString());
    }
}
