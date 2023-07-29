package org.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JuneFbBackground {
	@Given("using given in background")
	public void using_given_in_background() {
	   System.out.println("using given in background");
	}

	@When("using when in background")
	public void using_when_in_background() {
		System.out.println("using when in background");
	}

	@Then("using then in background")
	public void using_then_in_background() {
		System.out.println("using then in background");
	}
}
