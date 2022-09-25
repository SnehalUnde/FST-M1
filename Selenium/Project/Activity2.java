package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity2 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Check the title of the page
       WebElement img = driver.findElement(By.tagName("img"));
       String URL= img.getAttribute("src");
        System.out.println("URL: " + URL);

        //Close the browser
        driver.close();
    }
}