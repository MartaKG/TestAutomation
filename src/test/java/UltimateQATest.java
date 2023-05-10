import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

// access modifiers in Java
// difference between class, interface and abstract class
public class UltimateQATest extends PageSetup {

    // keyword void - return from function
    // keyword static
    @Test
    public void testOne() {
        WebElement button = driver.findElement(By.id("idExample"));
        button.click();

        WebElement buttonSuccess = driver.findElement(By.className("entry-title"));
        assertEquals("Button success", buttonSuccess.getText());

    }

    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameInput = driver.findElement(By.id("et_pb_contact_name_0"));
        nameInput.sendKeys("Marta");

        WebElement emailInput = driver.findElement(By.id("et_pb_contact_email_0"));
        emailInput.sendKeys("tester@tester.pl");
        Thread.sleep(2000);

        WebElement buttonSuccess = driver.findElement(By.name("et_builder_submit_button"));
        buttonSuccess.click();
        Thread.sleep(2000);

        WebElement thanksText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
        assertEquals("Thanks for contacting us", thanksText.getText());
    }
    @Test
    public void TestThree() throws InterruptedException {
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.linkText("Go to login page"));
        link.click();
        Thread.sleep(2000);

        assertEquals(loginPageURL, driver.getCurrentUrl());

    }
}
