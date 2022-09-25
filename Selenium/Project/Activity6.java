package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        WebElement Username = driver.findElement(By.id("txtUsername"));
        WebElement Password = driver.findElement(By.id("txtPassword"));
        //Enter text
        Username.sendKeys("orange");
        Password.sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        String title= driver.findElement(By.id("menu_directory_viewDirectory")).getText();
        System.out.println("Title is: " + title);
        //Verify Element is Visible
        driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
        //Verify Element is clickable
        driver.findElement(By.xpath("//*[contains(@id,'menu_directory_viewDirectory')]")).click();
        driver.findElement(By.xpath("//*[contains(@id,'menu_directory_viewDirectory')]")).click();
        String SearchDirectory =driver.findElement(By.xpath("//*[contains(text(),'Search')]")).getText();
        System.out.println("Page title is: " + SearchDirectory);
        driver.findElement(By.xpath("//*[contains(text(),'Search')]")).equals("Search Directory");

        driver.close();



    }

}
