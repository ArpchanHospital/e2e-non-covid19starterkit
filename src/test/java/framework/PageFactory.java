package framework;

import pages.HomePage;
import pages.LoginPage;
import pages.WelcomePage;
import pages.RegistrationPage;

public class PageFactory extends Driver {


    private static WelcomePage welcomePage;
    private static LoginPage loginPage;
    private static HomePage homePage;
    private static RegistrationPage registrationPage;

    public static WelcomePage getWelcomePage() {
        return welcomePage;
    }

    public static HomePage getHomePage() {
        return homePage;
    }

    public static LoginPage getLoginPage() {
        return loginPage;
    }

    public static RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

    public static void instantiatePages() {
        loginPage = new LoginPage();
        welcomePage = new WelcomePage();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
    }
}