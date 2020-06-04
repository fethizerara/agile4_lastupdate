package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gestionLivre.Auteur;
import gestionLivre.Livre;

public class PresenterLivreStep {
	
	private Livre livre;
	private String info;
	private Auteur auteur;

	@Given("Un livre caracterisé par son titre {string} son prix {double}")
	public void un_livre_caracterisé_par_son_titre_son_prix(String titre, Double prix) {
		livre = new Livre(titre, prix);
		auteur = new Auteur();
		livre.setAuteur(auteur);

	}

	@When("Le lecteur lui demande de lui montrer le livre")
	public void le_lecteur_lui_demande_de_lui_montrer_le_livre() {
		info = livre.infoLivre();

	}

	@Then("l'application renvoie {string} du livre demandé")
	public void l_application_renvoie_du_livre_demandé(String information) {
		assertEquals(information, info);

	}

}
