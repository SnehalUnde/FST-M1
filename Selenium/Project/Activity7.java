package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement Username = driver.findElement(By.id("txtUsername"));
        WebElement Password = driver.findElement(By.id("txtPassword"));
        //Enter text
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();
Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
//Qualifications
        driver.findElement(By.xpath("(//*[contains(text(),'Qualifications')])[2]")).click();
        driver.findElement(By.id("addWorkExperience")).click();

        WebElement Company = driver.findElement(By.id("experience_employer"));
        WebElement JobTitle = driver.findElement(By.id("experience_jobtitle"));
        //Enter text
        Company.sendKeys("ABCD");
        JobTitle.sendKeys("Engineer");
        driver.findElement(By.id("btnWorkExpSave")).click();


    }
}
