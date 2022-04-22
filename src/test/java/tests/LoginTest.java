package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(description = "Log in with user data")
    public void login() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("illia.a6ram@gmail.com", "pipikonda5");
        projectsPage.isPageOpened();
    }
}
