package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement Username = driver.findElement(By.id("txtUsername"));
        WebElement Password = driver.findElement(By.id("txtPassword"));
        //Enter text
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();

        driver.findElement(By.id("btnAdd")).click();

        WebElement FirstName = driver.findElement(By.id("firstName"));
        WebElement LastName = driver.findElement(By.id("lastName"));
        //Enter text
        FirstName.sendKeys("First");
        LastName.sendKeys("Last");

        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        WebElement EmployeeName = driver.findElement(By.id("empsearch_employee_name_empName"));

        //Enter text
        EmployeeName.sendKeys("First Last");
        driver.findElement(By.id("searchBtn")).click();

        driver.close();










    }

}
