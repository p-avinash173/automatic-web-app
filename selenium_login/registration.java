package selenium_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\phase5\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0NTIxNTM2LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		System.out.println("Facebok Opened in Browser"); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("Pinnamreddy");
		System.out.println("First Name Entered");
		driver.findElement(By.name("lastname")).sendKeys("Avinash Reddy");
		System.out.println("Last Name Entered");
		driver.findElement(By.name("reg_email__")).sendKeys("pavinashreddy317@gmail.com");
		System.out.println("Email id Entered");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavinashreddy317@gmail.com");
		System.out.println("Reentered Email Id");
		driver.findElement(By.id("password_step_input")).sendKeys("Avinash173@");
		System.out.println("Password Entered");
		driver.findElement(By.name("birthday_day")).sendKeys("17");
		System.out.println("Birth Day Selected");
		driver.findElement(By.name("birthday_month")).sendKeys("03");
		System.out.println("Birth Month Selected");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		System.out.println("Birth Year Selected");
		driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
		System.out.println("Sex Selected");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("websubmit")).click();
		System.out.println("Clicked On SignUp Button");
		
	}
		
		

	}