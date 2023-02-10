package com.test.steps;

import com.test.helper.JsonHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;


public class TestSteps {
    public TestSteps() {
    }

    @Given("I am an user")
    public void iAmAnUser() {
    }


    @When("I verify RCB team for 4 foreign players")
    public void iVerifyRCBTeamFor4ForeignPlayers() throws JSONException {

        JSONObject jsonObject = new JSONObject(JsonHelper.JsonString);
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


    @When("I verify RCB team for at least 1 wicket keeper")
    public void iVerifyRCBTeamForAtLeastWicketKeeper() throws JSONException {
        JSONObject jsonObject = new JSONObject(JsonHelper.JsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("player");
        for (int i = 0; i < jsonArray.length(); i++) {
            String role = jsonArray.getJSONObject(i).getString("role");
            if (role.equalsIgnoreCase("Wicket-keeper")) {
                Assert.assertEquals("Wicket-keeper", role);
                System.out.println("Found Wicket Keeper:" + jsonArray.getJSONObject(i)+"\n");
            }
        }
    }

    @Then("I validate wicket keeper is available")
    public void iValidateWicketKeeperIsAvailable() {
        System.out.println("Found Wicket Keeper in RCB team...Ee salaa cup namde!!");
    }
}
