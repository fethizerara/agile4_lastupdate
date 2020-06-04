package gestionLivre;
import java.util.ArrayList;
import java.util.List;

/**
 * Décrivez votre classe Auteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Auteur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom = "Laye";
    private int nbVentes = 0;
    private List<Livre> livres = new ArrayList<Livre>();
    
    /**
     * Constructeur d'objets de classe Auteur
     */
    public Auteur()
    {
    }
    
    public String afficherLivres() {
    	String allLivres = "Les livres de " + this.nom + " sont : ";
    	for (int i=0; i<livres.size(); i++) {
    		allLivres += livres.get(i).getTitre();
    		if (i != livres.size() - 1)
    				allLivres += ",";
    		
    	}
    	return allLivres;
    }
    
    public Auteur(String nom, int nbVentes) {
		this.nom = nom;
		this.nbVentes = nbVentes;
	}


	public String infoAuteur() {
        return this.nom + " a vendu " + this.nbVentes + " livres";
    }
    public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public void addLivre(Livre livre) {
		livre.setAuteur(this);
    	this.livres.add(livre);
    }
    
    public void removeLivre(Livre livre) {
    	this.livres.remove(livre);
    }
    
    public int vente(int nbExemplairesVendus)
    {
        this.nbVentes += nbExemplairesVendus;
        return this.nbVentes;
    }
    
    public String getNom()
    { // Insérez votre code ici
        return this.nom;
    }
    
    public void setNom(String nom)
    {   // Insérez votre code ici
        this.nom = nom;
    }
}
