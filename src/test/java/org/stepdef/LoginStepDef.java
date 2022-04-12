package org.stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pagerepository.LoginPageRepository;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginStepDef {
	LoginPageRepository pg = new LoginPageRepository();

	@Given("This is to check background functionality")
	public void this_is_a_given_statement(DataTable table) {
		List<Map<String, String>> asMaps = table.asMaps();

		System.out.println(asMaps.get(0));
		System.out.println(asMaps.get(1));
		System.out.println(asMaps.get(2));

		System.out.println(asMaps.get(1).get("Username"));
		
		System.out.println(asMaps.get(2).get("Batch"));

		Hook.driver.get("https://www.facebook.com/");
	}

	@When("^Enter the fields username and password$")
	public void enter_the_fields_username_and_password() {
		Hook.type("Karthikeyan", pg.getUsername());
		Hook.type("Subramanian", pg.getPassword());
	}

	@And("^Print Something$")
	public void print_something() {
		System.out.println("This is AND statement");
	}

	@But("^This is also a conjunction statement$")
	public void this_is_also_a_conjunction_statement() {
		System.out.println("This is also a conjunction statement");
	}

	@Then("^Close the chrome browser$")
	public void close_the_chrome_browser() {
		Hook.driver.close();
	}
}
