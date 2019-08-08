import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class User_reg {
    public static void main  (String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get ("http://www.sharelane.com");



        WebElement el_enter = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));

        el_enter.click();

        WebElement el_login = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        el_login.click();

        WebElement el_zip = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        el_zip.sendKeys("99999");

        WebElement el_contin = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        el_contin.click();

        WebElement el_name = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        el_name.sendKeys("TestUser");

        WebElement el_mail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        el_mail.sendKeys("TeUser@gmail.com");

        WebElement el_pass = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        el_pass.sendKeys("aaaaa");

        WebElement el_pass2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        el_pass2.sendKeys("aaaaa");
        el_pass2.sendKeys(Keys.ENTER);

    }
}
