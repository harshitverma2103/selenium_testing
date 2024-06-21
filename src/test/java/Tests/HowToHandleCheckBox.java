package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HowToHandleCheckBox {
     public static void main(String[] args) {
          ChromeOptions options = new ChromeOptions();
          WebDriver driver = new ChromeDriver(options);

          // Handle checkbox
          driver.get("https://testautomationpractice.blogspot.com/");
          driver.manage().window().maximize();

          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,500)");

          // Select a specific checkbox
          driver.findElement(By.xpath("//input[@id='sunday']")).click();

          // Select all the checkboxes
          List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

          // Iterate over the checkboxes and perform actions (e.g., select all)
          for (WebElement checkbox : checkBoxes) {
               if (!checkbox.isSelected()) {
                    checkbox.click();
               }
          }

          // Wait for a few seconds to see the results
          try {
               Thread.sleep(5000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }

          // Close the browser
          driver.close();
     }
}
