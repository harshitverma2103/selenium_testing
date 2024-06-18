package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyHowToVisitLink {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.opencart.com/");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        if (title.equals("Your Store")) {
            System.out.println("Test passed!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Test failed!");
        }
        driver.quit();
    }
}
