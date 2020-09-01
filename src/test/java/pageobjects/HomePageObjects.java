package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {


        public WebElement subscribe(WebDriver driver) {
            return driver.findElement(By.className("button"));
        }
    }

