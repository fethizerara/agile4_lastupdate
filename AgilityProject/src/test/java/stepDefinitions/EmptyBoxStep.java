package stepDefinitions;
import org.junit.Assert;
import Cheval.Box;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EmptyBoxStep {

	
	@Given("User wants to empty the box")
	public void user_wants_to_empty_the_box(Box box) {
		if(the_box_is_not_empty(box)) {
    		empty_the_box(box);
        	System.out.println("The box has been cleared");
    	}
    	else 
    	System.out.println("The box is already empty");
	}

	@When("The box is not empty")
	public boolean the_box_is_not_empty(Box box) {
        return box.getChevaux().size()>0;

	}

	@Then("Empty the box")
	public void empty_the_box(Box box) {
		for(int i=0;i<box.getChevaux().size();i++) {
    		box.getChevaux().get(i).setBox(null);
    	}	
       box.getChevaux().removeAll(box.getChevaux()); 
	}
	
	
}
