package gestionLivre;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import gestionLivre.Auteur;
import gestionLivre.Livre;

public class AuteurTest {
	
	private Auteur auteur1;
	
	@Before
	public void setUp() throws Exception {
		auteur1 = new Auteur();
	}

    @Test
    public void testAddLivre()
    {
        Livre livre = extracted(auteur1);
        assertTrue(auteur1.getLivres().contains(livre));
    }
    
    @Test
    public void testAuteur() {
    	assertNotNull(auteur1);
    }
    
    @Test
    public void testRemoveAddLivre()
    {
        Livre livre = extracted(auteur1);
        auteur1.removeLivre(livre);
        assertFalse(auteur1.getLivres().contains(livre));
    }
    
    @Test
    public void testBidirectionnel()
    {
        Livre livre = extracted(auteur1);
        assertEquals(auteur1, livre.getAuteur());	       
    }

	private Livre extracted(Auteur auteur) {
		Livre livre = new Livre();
        auteur.addLivre(livre);
		return livre;
	}
	
	@Test
	public void testGetNom() {
		assertEquals("Laye", auteur1.getNom());
	}
	
	@Test
	public void testSetNom() {
		auteur1.setNom("Nguyen");
		assertEquals("Nguyen", auteur1.getNom());
	}
	
	@Test
	public void testSetLivres() {
		List<Livre> livres = new ArrayList<Livre>();
		auteur1.setLivres(livres);
		assertEquals(livres, auteur1.getLivres());
	}
	
	@Test
	public void testGetLivres() {
		Livre livre = extracted(auteur1);
		assertTrue(auteur1.getLivres().contains(livre));
	}
	
	@Test
	public void testVente() {
		assertEquals(10, auteur1.vente(10));
	}
	
	@Test
	public void testRemoveLivre() {
		 Livre livre = extracted(auteur1);
		 auteur1.removeLivre(livre);
		 assertFalse(auteur1.getLivres().contains(livre));
	}
}
