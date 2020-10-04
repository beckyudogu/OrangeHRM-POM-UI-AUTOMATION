package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetUpTests {
    private WebDriver driver;
    //create LoginPage object
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        //selenium Webdriver needs this executable in order to know which browserto run your test
        //Browser setup for chrome
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //instantiate login name after launching the browser - handle
        loginPage = new LoginPage(driver);
    }


    @AfterTest
    public void closeBrowser()
    {
        //close window
        driver.quit();
    }

}


