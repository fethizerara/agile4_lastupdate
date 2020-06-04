package stepDefinitions;
import Cheval.Box;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class IncreaseBoxCapacity {

	@Given("Un box a traiter {Box} et une nouvelle capacite {int}")
	public void un_box_a_traiter_et_une_nouvelle_capacite(Box box, Integer int1) {
	if(la_capacite_est_superieur_à_la_capacité_actuelle(box,int1))
		augmenter_la_capacité_du_box_par_la_capacité(box,int1);
	}

	@When("la capacite {int} est superieur à la capacité actuelle")
	public boolean la_capacite_est_superieur_à_la_capacité_actuelle(Box box,Integer int1) {
	  return box.getCapacity()<int1;
	}

	@Then("augmenter la capacité du box {string} par la capacité {int}")
	public void augmenter_la_capacité_du_box_par_la_capacité(Box box, Integer int1) {
	    box.setCapacity(int1);
	    System.out.println("la nouvelle capacité du box est : "+int1);
	}
}
