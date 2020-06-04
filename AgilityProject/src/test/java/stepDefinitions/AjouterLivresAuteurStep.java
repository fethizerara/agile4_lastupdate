package stepDefinitions;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gestionLivre.Auteur;
import gestionLivre.Livre;


public class AjouterLivresAuteurStep {
	private Auteur auteur;
	private Livre livreToAdd; 
	private String infos;
	
	@Given("Un auteur")
	public void un_auteur() {
	   auteur = new Auteur();
	}

	@Given("un livre {string} et son {double}")
	public void un_livre_et_son(String titre, Double prix) {
		livreToAdd = new Livre(titre, prix);
		auteur.addLivre(livreToAdd);
	}

	@When("l employé ajoute des livres d'un auteur")
	public void l_employé_ajoute_des_livres_d_un_auteur() {
		infos = auteur.afficherLivres();
	}

	
	@Then("l application renvoie les {string}")
	public void l_application_renvoie_les_livres_ajoutés_de_l_auteur(String infoLivres) {
		Assert.assertEquals(infoLivres,	infos);
	}
}
