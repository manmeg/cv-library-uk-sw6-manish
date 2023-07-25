package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

/**
 * 2.ResultPage
 *   Locators - resultText
 *   Method - verifyTheResults(String expected)
 */

public class ResultPage extends Utility
{

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement result ;


    public String verifyTheResults(String results) {
        results = getTextFromElement(result);
        log.info("Getting result "+ result.toString());
        return results;
    }

}
