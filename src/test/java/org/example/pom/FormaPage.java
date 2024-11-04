package org.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormaPage {
    @FindBy(xpath = "//*@id='firstName']" )
    private WebElement firstNameEl;

    public static WebDriver driver;

    public FormaPage (WebDriver driver){
        FormaPage.driver = driver{

        }
    }

    public void  setFirstNameEl (string firstNameParam){
        firstNameParam
    }
}
