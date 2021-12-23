import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MileStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://the-internet.herokuapp.com/");
			driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[25]/a")).click();
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/img"))).click().build().perform();
			String innerText2 = driver.findElement(By.xpath("//*[@id=\'content\']/div/div[1]/div/h5")).getText(); 	
	        System.out.println(innerText2); 
	        
	        driver.navigate().back();
			 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[6]/a")).click();
			 	driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
			 	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 	driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]")).click();
			 	driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
		        driver.navigate().back();
		        
			 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[27]/a")).click();
			 	driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/input")).sendKeys("1234");
		        driver.navigate().back();
		        
			 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[11]/a")).click();
				Select option = new Select(driver.findElement(By.id("dropdown")));
				option.selectByIndex(2);
		        driver.navigate().back();
		        
			 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[18]/a")).click();

			 	driver.findElement(By.id("file-upload")).sendKeys("C:\\index.html");
			 	driver.findElement(By.id("file-submit")).click();
		        driver.navigate().back();
		        driver.navigate().back();

			 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[41]/a")).click();

			 	
			 	int i = 1;
				String nameXpath = "//*[@id=\"table1\"]/tbody/tr[" + i + "]/td[2]";
				
				while(driver.findElements(By.xpath(nameXpath)).size() > 0) {
					String name = driver.findElement(By.xpath(nameXpath)).getText();
					if(name.equalsIgnoreCase("Tim")) {
						String emailXpath = "//*[@id=\"table1\"]/tbody/tr[" + i + "]/td[3]";
						String webSiteXpath = "//*[@id=\"table1\"]/tbody/tr[" + i + "]/td[5]";
						String email = driver.findElement(By.xpath(emailXpath)).getText();
						String webSite = driver.findElement(By.xpath(webSiteXpath)).getText();
						System.out.println("Email: "+ email + ", Website: " + webSite);
						break;
					}
					i++;
					nameXpath = "//*[@id=\"table1\"]/tbody/tr[" + i + "]/td[2]";
				}
				
				driver.navigate().back();

			 	
				 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[31]/a")).click();
				 	driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
			        driver.navigate().back();
			        driver.navigate().back();

				 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[33]/a")).click();
				 	driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
				 	Set<String> ids=driver.getWindowHandles();
					 Iterator<String> it=ids.iterator();
					 String parentId=it.next();
					 String childId=it.next();
					 driver.switchTo().window(childId);
				 	String window = driver.findElement(By.xpath("/html/body/div/h3")).getText(); 	
				       System.out.println(window); 
						 driver.switchTo().window(parentId);
					        driver.navigate().back();

						 	driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[7]/a")).click();

						 	WebElement web=driver.findElement(By.xpath("//*[@id=\'hot-spot\']"));
						 	a.contextClick(web).perform();

	  
}
}
