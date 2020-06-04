package designPattern;

import gestionLivre.Livre;

public abstract class LivreFactory {
	
	public Livre getLivre() {
		return ecrireLivre();
	}
	
	public abstract Livre ecrireLivre();
}
