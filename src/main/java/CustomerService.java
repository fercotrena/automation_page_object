import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static webdriver.Webdriver.getChromeDriver;

public class CustomerService {


    public static String sendAMessage(String message,String email){
        WebDriver driver = getChromeDriver();
        driver.get(CustomerServicePage.URL);
        WebElement dropdown = driver.findElement(By.id("id_contact"));
        dropdown.findElement(By.xpath("//option[. = 'Customer service']")).click();

        driver.findElement(By.id("id_contact")).click();
        driver.findElement(By.name("id_order")).click();

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);

        driver.findElement(CustomerServicePage.message_text).sendKeys(message);
        driver.findElement(By.cssSelector("#submitMessage > span")).click();

        return driver.findElement(By.cssSelector(".alert")).getText();

    }



}
