package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.HomePageObjects;
import pageobjects.LoginPageObject;

public class HomePageTestCase {

    @Test
    public void homepage() {
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");


        PageFactory.initElements(driver,HomePageObjects.class);

        HomePageObjects.subscribe.click();

        PageFactory.initElements(driver,LoginPageObject.class);




        LoginPageObject.username.sendKeys("Admin");
        LoginPageObject.password.sendKeys("admin123");
        LoginPageObject.submit.click();

//        HomePageObjects.subscribe(driver).click();


//        LoginPageObject.username(driver).sendKeys("Admin");
//        LoginPageObject.password(driver).sendKeys("admin123");
//        LoginPageObject.submit(driver).click();



//        HomePageObjects homePageObjects=new HomePageObjects();
//        homePageObjects.subscribe(driver).click();
////
//        LoginPageObject loginPageObject=new LoginPageObject();
//        loginPageObject.username(driver).sendKeys("Admin");
//        loginPageObject.password(driver).sendKeys("admin123");
//        loginPageObject.submit(driver).click();


//        driver.quit();
        }
}
