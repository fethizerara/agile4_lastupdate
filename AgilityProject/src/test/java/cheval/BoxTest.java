package cheval;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Cheval.Box;
import Cheval.Cheval;
import gestionLivre.Auteur;

public class BoxTest {
	
	private Box box;
	


	 @Before
	    public void setUp() // throws java.lang.Exception
	    {

	        ArrayList<Cheval> chevaux = new ArrayList<Cheval>();

	        box = new Box(chevaux, 2);
	        
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
    public void testStatut()
    {
        Cheval cheval1 = new Cheval(323, 7);
        Cheval cheval2 = new Cheval(333, 8);
        assertEquals("le statut du cheval 333 : age => 8", cheval2.statutCheval());
        assertEquals(8, cheval2.getAge());
        assertEquals(333, cheval2.getId());
    }



    @Test
    public void testRemoveCheval()
    {
        Cheval cheval1 = new Cheval(323, 7);

        box.addCheval(cheval1);
        assertEquals(box.getCheval(0), cheval1);
        box.removeCheval(cheval1);
        assertEquals(cheval1.getBox(), null);

    }


    @Test
    public void testAddCheval()
    {
        Cheval cheval1 = new Cheval(323, 7);
        Box box1 = new Box ();
        box1.addCheval(cheval1);
        assertEquals(box1.getCheval(0), cheval1);
        assertEquals(cheval1.getBox(), box1);

    }




    @Test
    public void testConstructorBox()
    {
        Cheval cheval1 = new Cheval(323, 7);
        ArrayList<Cheval> horses = new ArrayList<Cheval>();
        horses.add(cheval1);
        Box box1 = new Box (horses,3);
        assertEquals(box1.getCheval(0), cheval1);
        assertEquals(box1.getNumero(),3);

    }


    @Test
    public void testGetterCapacityBox()
    {
        assertEquals(box.getCapacity(), 10);
    }

    @Test
    public void testSetterCapacityBox()
    {
        box.setCapacity(15);
        assertEquals(box.getCapacity(), 15);


    }


}
