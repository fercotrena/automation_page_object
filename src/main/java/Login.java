import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static webdriver.Webdriver.getChromeDriver;

public class Login {


    public static void authentication(String email, String password) {
        WebDriver driver = getChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

    }

    public static void authenticationByDefault() {
        String email = "fernandocotrena@gmail.com";
        String password = "admin123456";
        Login.authentication(email, password);

    }

}
