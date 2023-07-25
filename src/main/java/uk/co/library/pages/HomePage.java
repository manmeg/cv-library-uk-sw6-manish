package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

/**
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 *   Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
 *   enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
 *   clickOnFindJobsButton().
 */

public class HomePage extends Utility
{

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salarymin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salarymax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobtype ;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;



    public void acceptCookies(){
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookies);
        log.info("Clicking on login link : " + acceptCookies.toString());
    }

    public void enterJobTitle(String jobTitles) {
        sendTextToElement(jobTitle,jobTitles);
        log.info("Enter JobTitle "+ jobTitle );
    }

    public void enterLocation(String locations) {
        sendTextToElement(location, locations);
        log.info("Enter Location " + location);
    }

    public void selectDistance(String distances){
        selectByVisibleTextFromDropDown(distance, distances);
        log.info("Select Miles " + distance);
    }

    public void clickOnMoreSearchOption() {
        clickOnElement(moreSearchOptionsLink);
        log.info("Clicking on More search option : " + moreSearchOptionsLink.toString());
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salarymin, minSalary);
        log.info("Enter Salary Minimum " + salarymin);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salarymax, maxSalary);
        log.info("Enter Salary Maximum " + salarymax);
    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
        log.info("Select Salary Type " + salaryTypeDropDown);
    }

    public void selectJobType(String jobTypes) {
        selectByVisibleTextFromDropDown(jobtype, jobTypes);
        log.info("Select Job Type " + jobtype);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
        log.info("Clicking on Find Jobs Button : " + findJobsBtn.toString());
    }
}
