package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

    public WebElement username(WebDriver driver){
        return driver.findElement(By.id("txtUsername"));


    }
    public WebElement password( WebDriver driver){
        return driver.findElement(By.name("txtPassword"));

    }
    public WebElement submit( WebDriver driver){
        return driver.findElement(By.id("btnLogin"));

    }
}
