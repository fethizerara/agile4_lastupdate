package stepDefinitions;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PresenterAuteurStep {
	private Auteur auteur;
	private String infoAuteur; 

	@Given("Un auteur caracterisé par son nom {string} et son nombre de ventes {int}")
	public void un_auteur_caracterisé_par_son_nom_et_son_nombre_de_ventes(String nom, Integer nbVentes) {
	    auteur = new Auteur(nom, nbVentes);
	}
	
	@When("Un lecteur demande la présentation de l'auteur")
	public void un_lecteur_demande_la_présentation_de_l_auteur() {
	    infoAuteur = auteur.infoAuteur();
	}
	
	@Then("l'application renvoie {string}")
	public void l_application_renvoie(String information) {
		   Assert.assertEquals(information, infoAuteur);
	}
	
}
