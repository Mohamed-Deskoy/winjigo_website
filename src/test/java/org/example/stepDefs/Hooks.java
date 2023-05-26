package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\python\\FWD\\winjigo_website\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://swinji.azurewebsites.net");
    }

    @After
    public static void quitBrowser() {
        driver.quit();
    }
}
