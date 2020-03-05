import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rodrigo\\Curso Automatización\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
				
		driver.get("https://derco--uat.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vendedorgenericocolombia@axity.com");
		driver.findElement(By.id("password")).sendKeys("analista123");
		driver.findElement(By.id("Login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='slds-truncate'][contains(text(),'Candidatos')]"))).click();
		//driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Candidatos')]")).click();

	}

}
