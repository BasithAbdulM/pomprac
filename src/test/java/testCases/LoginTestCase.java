package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPageObject;

public class LoginTestCase {

    @Test
    public void logintest() {
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
        LoginPageObject loginPageObject=new LoginPageObject();
        loginPageObject.username(driver).sendKeys("Admin");
        loginPageObject.password(driver).sendKeys("admin123");
        loginPageObject.submit(driver).click();


        driver.quit();


    }
}
