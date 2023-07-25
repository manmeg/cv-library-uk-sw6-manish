package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on accept cookies")
    public void iClickOnAcceptCookies() {
        new HomePage().acceptCookies();
    }

    @And("I Enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I Enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I Select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search option")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("I Enter minimum salary {string}")
    public void iEnterMinimumSalary(String salarymin) {
        new HomePage().enterMinSalary(salarymin);
    }

    @And("I Enter maximum salary {string}")
    public void iEnterMaximumSalary(String salarymax) {
        new HomePage().enterMaxSalary(salarymax);
    }

    @And("I select from salary type {string}")
    public void iSelectFromSalaryType(String salarytype) {
        new HomePage().selectSalaryType(salarytype);
    }

    @And("I select from job type {string}")
    public void iSelectFromJobType(String jobtype) {
        new HomePage().selectJobType(jobtype);
    }

    @And("I click on find job button")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should see the Result page {string}")
    public void iShouldSeeTheResultPage(String result) {
        Assert.assertEquals("text not match",new ResultPage().verifyTheResults(result),result);
    }
}
