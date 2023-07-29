package org.stepdef;

import java.util.List;
import java.util.Map;

import org.pagerepo.LoginPageRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class JuneFbStepdef {

	@Given("Open facebook and launch")
	public void open_facebook_and_launch() {
		Hooks.driver.get("https://www.facebook.com");
	}

	@When("Enter username as {string} and password as {string}")
	public void enter_username_and_password(String username, String password) throws InterruptedException {
		LoginPageRepo repo = new LoginPageRepo();
		repo.getUsername().sendKeys(username);
		repo.getPassword().sendKeys(password);
	}

	@When("Enter data table values")
	public void xxxxxxx(DataTable dt) throws InterruptedException {
		List<Map<String, String>> lsm = dt.asMaps();
		System.out.println(lsm.get(0));
		System.out.println(lsm.get(1));
		System.out.println(lsm.get(2));

		System.out.println(lsm.get(0).get("Username"));
		System.out.println(lsm.get(0).get("Password"));
		System.out.println(lsm.get(1).get("Username"));
		System.out.println(lsm.get(1).get("Password"));
		System.out.println(lsm.get(2).get("Username"));
		System.out.println(lsm.get(2).get("Password"));
	}

	@And("supporting statement one")
	public void xx() {
		System.out.println("AND statement");
	}

	@But("supporting statement two")
	public void xxxx() {
		System.out.println("BUT statement");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("This test case is completed");
	}

}

// AS LIST
//List<String> ls = dt.asList();
//
//System.out.println(ls.get(0));
//System.out.println(ls.get(1));
//System.out.println(ls.get(2));

// AS LISTS
//List<List<String>> ls = dt.asLists();
//System.out.println(ls.get(0));
//System.out.println(ls.get(1));
//System.out.println(ls.get(2));
//
//System.out.println(ls.get(2).get(0));
//System.out.println(ls.get(2).get(1));
//System.out.println(ls.get(2).get(2));

// AS MAP
//Map<Integer, String> mp = dt.asMap(Integer.class, String.class);
//System.out.println(mp.get(1));
//System.out.println(mp.get(2));
//System.out.println(mp.get(3));

// AS MAPS
//List<Map<String, String>> lsm = dt.asMaps();
//System.out.println(lsm.get(0));
//System.out.println(lsm.get(1));
//System.out.println(lsm.get(2));
//
//System.out.println(lsm.get(0).get("Username"));
//System.out.println(lsm.get(0).get("Password"));
//System.out.println(lsm.get(1).get("Username"));
//System.out.println(lsm.get(1).get("Password"));
//System.out.println(lsm.get(2).get("Username"));
//System.out.println(lsm.get(2).get("Password"));
