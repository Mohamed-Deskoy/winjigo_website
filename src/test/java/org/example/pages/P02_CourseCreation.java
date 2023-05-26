package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_CourseCreation {
    public WebDriver driver;

    public P02_CourseCreation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement courseLink() {
        return driver.findElement(By.id("btnMyCoursesList"));
    }

    public WebElement creatCourseBut() {
        return driver.findElement(By.id("btnListAddCourse"));
    }

    public WebElement courseName() {
        return driver.findElement((By.id("txtCourseName")));
    }

    public WebElement subjectDropdown() {
        return driver.findElement(By.id("courseSubject"));
    }

    public WebElement selectGrade(){
        return driver.findElement(By.id("courseGrade"));
    }

    public WebElement courseTeacher(){
        return driver.findElement(By.className("ui-select-toggle"));
    }

    public WebElement courseCompletion(){
        return driver.findElement(By.xpath("//span[@class=\"lms-position-relative-imp lms-margin-start-10\"]"));
    }

    public WebElement saveButton() {
        return driver.findElement(By.id("btnSaveAsDraftCourse"));
    }

    public WebElement courseTitle() {
        return driver.findElement(By.id("courseNameView"));
    }
}
