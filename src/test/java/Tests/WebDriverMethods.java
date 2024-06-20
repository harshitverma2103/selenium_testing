package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {
     public static void main(String[] args) {
          ChromeOptions options = new ChromeOptions();

          WebDriver driver = new ChromeDriver(options);

          // get methods

          // get()
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          // getTitle()
          String title = driver.getTitle();
          System.out.println(title);

          // getCurrentUrl()

          String currentPageUrl = driver.getCurrentUrl();
          System.out.println(currentPageUrl);

          // getPageSource()

          String pageSource = driver.getPageSource();
          System.out.println(pageSource);

          // getWindowHadle()
          String window = driver.getWindowHandle();
          System.out.println(window);

          driver.quit();
     }
}
