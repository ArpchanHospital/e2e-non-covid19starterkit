package framework;

import pages.*;

public class PageFactory extends Driver {


    private static WelcomePage welcomePage;
    private static LoginPage loginPage;
    private static HomePage homePage;
    private static RegistrationPage registrationPage;
    private static ProgramsPage programsPage;
    private static ProgramDashboardPage programDashboardPage;

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

    public static ProgramsPage getProgramsPage() {
        return programsPage;
    }

    public static ProgramDashboardPage getProgramDashboardPage() {
        return programDashboardPage;
    }

    public static void instantiatePages() {
        loginPage = new LoginPage();
        welcomePage = new WelcomePage();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
        programsPage = new ProgramsPage();
        programDashboardPage = new ProgramDashboardPage();
    }
}