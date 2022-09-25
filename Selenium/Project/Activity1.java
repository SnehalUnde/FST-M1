package Activities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
       String expected = String.valueOf(driver.getTitle().equals("OrangeHRM"));
        System.out.println("Value is: " + expected);


           driver.close();

       }

    }
