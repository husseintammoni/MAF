package com.gitHub.automation.steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.*;
import org.json.JSONArray;
import org.junit.Assert;

import static com.gitHub.automation.common.StateHelper.getStepState;
import static com.gitHub.automation.common.StateHelper.setStepState;

public class GitHubJobsAPIStepDef {

    public static Response last_response;
    RestAssured client = new RestAssured();

    @When("^Send the API call GET ([^\"]*) with query parameters$")
    public void iSendTheAPICallGETHttpsJobsGithubComPositionsJsonWithQueryParameters(String url, String queryParameters) throws Throwable {

        System.out.println("\n[Service Request-URL]: " + url + queryParameters);

        last_response = client.given()
                .header("Content-Type", "application/json")
                .get(url + queryParameters)
                .then()
                .extract()
                .response();

        System.out.println("\n[Service Response-Body]: " + last_response.asString());
        System.out.println("\n[Service Status Code]: " + last_response.getStatusCode());
        System.out.println("\n[Service Status Line]: " + last_response.getStatusLine());
        JSONArray jsonResponse = new JSONArray(last_response.asString());
        setStepState("NumberOfJobs",jsonResponse.length());
    }

    @Then("^I should received response with status code 200.$")
    public void IShouldReceivedResponseWithStatusCode() {
        Assert.assertEquals(last_response.getStatusCode(), 200);
    }

    @Then("^Should received number of Jobs 50 per page.$")
    public void ShouldReceivedNumberOfJobsPerPage() {
        System.err.println("\n[Number of retrieve Jobs]: " + getStepState("NumberOfJobs") + "\n");
        Assert.assertEquals("50", getStepState("NumberOfJobs").toString());
    }
}
