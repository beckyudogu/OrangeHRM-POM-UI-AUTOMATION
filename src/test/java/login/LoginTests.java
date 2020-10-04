package login;

import SetUp.SetUpTests;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

    public class LoginTests extends SetUpTests {

        //TestNG Annotation
        @Test
        //this class extends to the SetupTests as the setuptests class contains all the setup requirement to run our test
        public void testLogin() throws InterruptedException
        {
            String username ="Admin";
            loginPage.enterUsername(username);
            loginPage.enterUserPassword("admin123");


            //handler for dashboard page
            DashboardPage dashboardPage = loginPage.clickLoginBtn();
            dashboardPage.clickWelcomeAdmin();
            loginPage =dashboardPage.clicklogout();
        }
    }


