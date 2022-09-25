package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement Username = driver.findElement(By.id("txtUsername"));
        WebElement Password = driver.findElement(By.id("txtPassword"));
        //Enter text
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
        driver.findElement(By.id("btnSave")).click();


        driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']")).clear();
        driver.findElement(By.xpath("//*[@id='personal_txtEmpLastName']")).clear();

        WebElement FirstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement LastName = driver.findElement(By.id("personal_txtEmpLastName"));
        //Enter text
        FirstName.sendKeys("John");
        LastName.sendKeys("Doe");

        driver.findElement(By.xpath("//*[@id='personal_optGender_1']")).click();

        driver.findElement(By.id("btnSave")).click();

        Thread.sleep(2000);

        driver.close();
    }
}
