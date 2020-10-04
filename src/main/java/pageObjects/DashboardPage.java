package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //create a WebDriver for this class
    private WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locate elements
    private By welcomeAdmin = By.xpath("//*[@id=\"welcome\"]");
    private By logout = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
    //functions to interact with element
    public void clickWelcomeAdmin() throws  InterruptedException
    {
        //wait for 10secs before executing action
        Thread.sleep(10000);
        driver.findElement(welcomeAdmin).click();

    }
    public LoginPage clicklogout() throws  InterruptedException
    {
        //wait for 3 seconds before executing the action
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }
}

