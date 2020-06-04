package stepDefinitions;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;

import Cheval.Box;
import Cheval.Cheval;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class YoungestHorseStep {
	
	
	
	@Given("User wants to take the yougest horse from the box <box>")
	public Cheval user_wants_to_take_the_yougest_horse_from_the_box_box(Box box) {
	   if(the_box_box_is_filled(box))
		  return get_the_yougest_hourse(box);
	   else
		   return null;
	}

	@When("the box  <box> is filled")
	public boolean the_box_box_is_filled(Box box) {
		return box.getChevaux().size()>0;
	}

	@Then("get the yougest horse {Cheval}")
	public Cheval get_the_yougest_hourse(Box box) {
		ArrayList ages = new ArrayList();
		for(int i=0;i<box.getChevaux().size();i++)
			ages.add(box.getCheval(i).getAge());
		int minimum = (int) Collections.min(ages);
		for(int i=0;i<box.getChevaux().size();i++) 
			if(box.getCheval(i).getAge()==minimum)
				return box.getCheval(i);
			
		return null;
			

	}
	
	
}
