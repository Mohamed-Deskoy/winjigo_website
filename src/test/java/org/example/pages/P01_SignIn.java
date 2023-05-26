package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_SignIn {
    public WebDriver driver;

    public P01_SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailField() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordField() {
        return driver.findElement(By.id("inputPassword"));
    }

    public WebElement signInButton() {
        return driver.findElement(By.id("btnLogin"));
    }


}
