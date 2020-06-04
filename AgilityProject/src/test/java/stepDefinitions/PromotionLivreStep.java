package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gestionLivre.Livre;
import org.junit.Assert;


public class PromotionLivreStep {
	
	private Livre livre;
	private double nouveauPrix;
	private String msgError;
	
	@Given("un livre et sa promotion {double}")
	public void un_livre_et_sa_promotion(Double promotion) {
	    livre = new Livre("Livre de la jungle", 15);
	    livre.promotion(promotion);	
    }
	
	
	@When("L'auteur veut faire une promotion")
	public void l_auteur_veut_faire_une_promotion() {
	    nouveauPrix = livre.getPrix();
	}



	@Then("le <nouveauPrix> doit être calculé")
	public void le_nouveauPrix_doit_être_calculé() {
	    Assert.assertEquals(7.5, nouveauPrix, 0.01);
	}

	
	
	@Given("un livre et sa promotion {double} négatif")
	public void un_livre_et_sa_promotion_négatif(Double promotion) {
	    livre = new Livre("Livre de la jungle", 15);
	    msgError = livre.promotion(promotion);	
	}

	@Then("le syustème refuse avec le {string}")
	public void le_syustème_refuse_avec_le(String string) {
	    Assert.assertEquals(msgError, "promotion négative");
	}

}
