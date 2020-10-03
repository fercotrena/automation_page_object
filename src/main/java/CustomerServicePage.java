import org.openqa.selenium.By;

public class CustomerServicePage {

    public static String URL = "http://automationpractice.com/index.php?controller=contact";
    public static By message_text  = By.id("message");
    public static String successMessage ="Your message has been successfully sent to our team.";
    public static String errorMessage ="Invalid email address.";

}
