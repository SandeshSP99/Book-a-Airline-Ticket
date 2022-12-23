package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {

	public static void main(String[] args){
	
       //set path of chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open URL of Website
		driver.get("https://blazedemo.com/");
		//maximize window
		driver.manage().window().maximize();
		
		//Navigate to URL
        driver.navigate().to("https://blazedemo.com/");
       // Navigate back
        driver.navigate().back();
        //Navigate Forward
        driver.navigate().forward();
        //Refresh page
        driver.navigate().refresh();
        
		 //  Verify the title of the homepage and print result in the console

        System.out.println("TITLE OF THE PAGE == "+driver.getTitle());

     
     //   write a test script to book a airline ticket

        //Drop Down
      WebElement no = driver.findElement(By.name("fromPort"));
      Select dropdown = new Select(no);
      dropdown.selectByVisibleText("Boston");
      WebElement no1 =driver.findElement(By.name("toPort"));
      Select dropdown2 = new Select(no1);
      dropdown2.selectByValue("London");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
       
      //locating form & sending user input
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
      driver.findElement(By.id("inputName")).sendKeys("Sandesh Padwal");
      driver.findElement(By.id("address")).sendKeys("India");
      driver.findElement(By.id("city")).sendKeys("Nashik");
      driver.findElement(By.id("state")).sendKeys("Maharashtra");
      driver.findElement(By.id("zipCode")).sendKeys("422101");
      
      //drop down
      WebElement xo =driver.findElement(By.id("cardType"));
      Select sle2 = new Select(xo);
      sle2.selectByVisibleText("American Express");
      //sending user input
      driver.findElement(By.id("creditCardNumber")).sendKeys("123456789");
      //clearing user input
        driver.findElement(By.id("creditCardMonth")).clear();
      driver.findElement(By.id("creditCardMonth")).sendKeys("05");
        driver.findElement(By.id("creditCardYear")).clear();
      driver.findElement(By.id("creditCardYear")).sendKeys("2022");
      driver.findElement(By.id("nameOnCard")).sendKeys("Sandesh Padwal");
     
      //remember me is selected
      WebElement rememberme = driver.findElement(By.id("rememberMe"));
      rememberme.click();
      
      driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
     

      //closing browser
      driver.close();
     
     
     




    

	}

}
