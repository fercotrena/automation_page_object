

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import webdriver.Webdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestCustomerService {

    @AfterEach
    public void tearDown() {
        Webdriver.quitDriver();

    }

    @Test
    public void CustomerServiceSendAMessage() {

        Login.authenticationByDefault();
        String expectedResult = CustomerService.sendAMessage("Testing modulo 5.", "fernandocotrena@gmail.com");
        assertEquals(CustomerServicePage.successMessage, expectedResult);

    }


    @Test
    public void CustomerServiceSendAMessageEmptyEmail() {

        Login.authenticationByDefault();
        String expectedResult = CustomerService.sendAMessage("Testing modulo 5.", "");

        assertTrue(expectedResult.contains(CustomerServicePage.errorMessage));


    }


}
