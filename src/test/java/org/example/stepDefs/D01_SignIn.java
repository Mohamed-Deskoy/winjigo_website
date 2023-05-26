package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P01_SignIn;
import static org.example.stepDefs.Hooks.driver;
public class D01_SignIn {
    P01_SignIn signIn = new P01_SignIn(driver);
    @Given("user go to login page")
    public void openWinjigoWebsite() {
        Hooks.driver.get("https://swinji.azurewebsites.net/account/login");
    }

    @When("sign in with valid credentials")
    public void signInWithCredentials() {
        signIn.emailField().sendKeys("testregister@aaa.com");
        signIn.passwordField().sendKeys("Wakram_123");
        signIn.signInButton().click();
    }


}
