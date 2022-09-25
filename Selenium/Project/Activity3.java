package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement Username = driver.findElement(By.id("txtUsername"));
        WebElement Password = driver.findElement(By.id("txtPassword"));
        //Enter text
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_dashboard_index")));
        driver.close();


    }
}