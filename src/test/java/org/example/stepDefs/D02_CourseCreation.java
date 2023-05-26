package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_CourseCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;
import static org.testng.Assert.assertTrue;

public class D02_CourseCreation {
    P02_CourseCreation courseCreation = new P02_CourseCreation(driver);

    @When("navigate to the courses page")
    public void navigateToCoursesPage() {
        courseCreation.courseLink().click();
    }

    @When("click on the create course button")
    public void clickCreateCourseButton() {
        courseCreation.creatCourseBut().click();
    }

    @When("fill in the course basic info")
    public void fillCourseBasicInfo() {
        courseCreation.courseName().sendKeys("RestAssured-Mohamed-Ahmed");

        Select selectsub = new Select(courseCreation.subjectDropdown());
        selectsub.selectByValue("number:7");

        Select selectGrade =new Select(courseCreation.selectGrade());
        selectGrade.selectByValue("number:11");

        courseCreation.courseTeacher().click();
        driver.findElement(By.className("ui-select-choices-row-inner")).click();

        courseCreation.courseCompletion().click();

    }

    @When("save the course")
    public void saveCourse() {
        courseCreation.saveButton().click();
    }

    @Then("should see the course title displayed")
    public void assertCourseTitleDisplayed() {
        assertTrue(courseCreation.courseTitle().isDisplayed());
    }

}
