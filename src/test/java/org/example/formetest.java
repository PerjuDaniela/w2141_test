package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class formetest {
    public static WebDriver driver;

    public void BeforeClass(){
        @BeforeClass
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @Test
public void Formatest(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement FindElement=driver. (By.xpath("//*@id='firstName']"))
                firstNameEl.sendKey("Daniela")
}
    public static void main(String[] args) {

    }
    @AfterClass
    public void close(){
        driver.quit();
    }
}
