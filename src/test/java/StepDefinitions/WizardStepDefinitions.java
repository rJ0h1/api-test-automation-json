package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class WizardStepDefinitions {

    private Response response;

    @Given("that user wants to review the list of Elixirs")
    public void usingElixirEndpoint() {
        RestAssured.basePath = "Elixirs";
    }

    @When("the user asks for a list of all elixirs")
    public void getListElixirs() {
        response = RestAssured.given()
                .log().all()
                .get();
    }
}