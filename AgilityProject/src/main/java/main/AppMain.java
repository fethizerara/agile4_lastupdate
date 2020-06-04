package main;

import java.util.ArrayList;
import java.util.List;

import Cheval.Cheval;
import designPattern.LivreFactory;
import designPattern.LivreFactory1;
import gestionLivre.Livre;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivreFactory factory1 = new LivreFactory1();
		Cheval cheval1 = new Cheval();
		Livre livre = factory1.ecrireLivre();
		//Création d'un livre par un cheval 
		
		List<Livre> listeLivre = new ArrayList<Livre>();
		
		listeLivre.add(livre);
		cheval1.setListeLivreEcrit(listeLivre);
		
		for (Livre liv : cheval1.getListeLivreEcrit()) {
			System.out.println(liv.getPrix());
		}
		
		

	}

}
