package designPattern;

import gestionLivre.Livre;

public class LivreFactory1 extends LivreFactory{
	@Override
	public Livre ecrireLivre() {
		// TODO Auto-generated method stub
		return new Livre();
	}

}
