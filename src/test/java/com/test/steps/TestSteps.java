package com.test.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.json.JSONArray;
import org.json.JSONObject;

public class TestSteps {
    public TestSteps() {
    }
    @Given("I am an user")
    public void iAmAnUser() {
    }

    @When("I verify RCB team for 4 foreign players")
    public void iVerifyRCBTeamFor4ForeignPlayers() {

        JSONObject jsonObject = new JSONObject("src/test/resources/testData/RCBjson.json");

        JSONArray jsonArray = jsonObject.getJSONArray("player");
        for (int i = 0; i < jsonArray.length(); i++) {
            String country = jsonArray.getJSONObject(i).getString("country");
            if(!country.equalsIgnoreCase("India"))
            {
                String name = jsonArray.getJSONObject(i).getString("name");
                System.out.println(name);
            }

        }

    }
    @Then("I validate 4 foreign players are available")
    public void iValidate4ForeignPlayersAvailable() {
        System.out.println("RCB team has 4 foreign players");
    }


}
