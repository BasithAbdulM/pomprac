package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
    @FindBy(className = "button")
    public static WebElement subscribe;


//        public static WebElement subscribe(WebDriver driver) {
//            return driver.findElement(By.className("button"));
//        }
    }

