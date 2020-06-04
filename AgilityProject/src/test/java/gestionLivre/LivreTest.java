package gestionLivre;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gestionLivre.Auteur;
import gestionLivre.Livre;

/**
 * Classe-test LivreTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class LivreTest
{
    private Livre livre1;
    private Auteur auteur1;
    
    /**
     * Constructeur de la classe-test LivreTest
     */
    public LivreTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        livre1 = new Livre();
        auteur1 = new Auteur();
        livre1.setAuteur(auteur1);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    @Test
    public void testLivre() {
    	assertNotNull(livre1);
    }

    @Test
    public void testPromotion()
    {
        Livre livre2 = new Livre();
        livre2.promotion(0.5);
        assertEquals(25, livre2.getPrix(), 0.001);
    }

    @Test
    public void testVente()
    {
        livre1.setAuteur(auteur1);
        assertEquals(50, livre1.vente(50));
        assertEquals(65, livre1.vente(15));
    }
    
    @Test
    public void testInfolivre() {
    	assertEquals("Le livre Histoire de l'Art coûte 50.0", livre1.infoLivre() );
    }
    
    @Test
    public void testSetPrix() {
    	livre1.setPrix(500);
    	assertEquals(500, livre1.getPrix(), 0.001);
    }
    
    @Test
    public void testGetPrix() {
    	assertEquals(50, livre1.getPrix(), 0.001);
    }
    
    @Test
    public void testSetTitre() {
    	livre1.setTitre("La lumi�re de mandragore");
    	assertEquals("La lumi�re de mandragore", livre1.getTitre());
    }
    
    @Test
    public void testGetTitre() {
    	Livre livre = new Livre();
    	assertEquals("Histoire de l'Art", livre.getTitre());
    }
    
    @Test
    public void testGetAuteur() {
    	livre1.setAuteur(auteur1);
    	assertEquals(auteur1, livre1.getAuteur());
    }
    
    @Test
    public void testGetNbVendus() {
    	Livre livre = new Livre();
    	assertEquals(0, livre.getNbVendus());
    }
    
    @Test
    public void testSetNbVendus() {
    	Livre livre = new Livre();
    	livre.setNbVendus(40);
    	assertEquals(40, livre.getNbVendus());
    }
    
}


