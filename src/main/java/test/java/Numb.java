package test.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numb {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "E:\\ITEA\\TaskSel4\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://iteaua-develop.demo.gns-it.com/");
        Thread.sleep(5000); /*Без thread.sleepОВ тест падает*/
        By ListNumbers = By.className("phones-block");
        WebElement number = driver.findElement(ListNumbers);
        number.click();
        Thread.sleep(3000); /*Без thread.sleepОВ тест падает*/
        WebElement vodafone = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[1]/ul/li[3]/a"));
        vodafone.click();
        String vodafoneValue = vodafone.getText();
        System.out.println(vodafoneValue);
        driver.quit();

    }
}
