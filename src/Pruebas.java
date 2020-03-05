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
		driver.get("https://derco--uat.my.salesforce.com/2");
		driver.get("https://deqwerco--uat.my.salesforce.com/3");
		
		//fsfa
		driver.get("https://derco--uat.qwmy.salesforce.com/4");
		driver.get("https://derco--uat.my.salesforce.com/5");
				
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vendedorgenericocolombia@axity.com");
		driver.findElement(By.id("username")).sendKeys("vendedorgenericocolombia@axity.com");
		driver.findElement(By.id("password")).sendKeys("analista123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("Logeqin")).click();
		wait.until(ExpectedConditions.elementTqweoBeClickable(By.xpath("//span[@class='slds-truncate'][contains(text(),'Candidatos')]"))).click();
		//driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Candidatos')]")).click();

	}

}
