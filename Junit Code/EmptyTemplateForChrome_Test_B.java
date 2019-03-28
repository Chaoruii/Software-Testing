package PJ;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;     // for Firefox 
import org.openqa.selenium.chrome.ChromeDriver;       // for chrome

/**
 * 
 * Note: 
 *   Test environment: Chrome Version 68, selenium 3.14.0, Java 8, ChromeDriver 2.42
 */

public class EmptyTemplateForChrome_Test 
{	
   private WebDriver driver;
   private String url = "http://127.0.0.1:8000";
   
   // Click on StartGame button
   private void startGame()
   {
	    WebElement startgame = driver.findElement(By.id("start-game"));
	    startgame.click();
   }
   
   // Click on Attack button
   private void attack()
   {
	    WebElement attack = driver.findElement(By.id("attack"));
	    attack.click();
   }
   
   // Click on Special Attack button
   private void specialAttack()
   {
	   WebElement specialAttack = driver.findElement(By.id("special-attack"));
	   specialAttack.click();
   }
   
   // Click on Special Attack button
   private void heal()
   {
	   WebElement heal = driver.findElement(By.id("heal"));
	   heal.click();
   }
   
   // Click on Give Up button
   private void giveUp()
   {
	   WebElement giveup = driver.findElement(By.id("give-up"));
	   giveup.click();
   }
   
   // Get your health
   private int getYourHealth()
   {
	   List<WebElement> healthbar = driver.findElements(By.cssSelector("div.healthbar.text-center"));
	   return Integer.parseInt(healthbar.get(0).getText());
   }
 
   // Get monster health
   private int getMonsterHealth()
   {
	   List<WebElement> healthbar = driver.findElements(By.cssSelector("div.healthbar.text-center"));
	   return Integer.parseInt(healthbar.get(1).getText());
   }
   
   // Check if in the beginning page
   private String checkRowsControl()
   {
	   WebElement rowscontrol = driver.findElement(By.cssSelector("section.row.controls"));
	   return rowscontrol.getText();
   }

   @Before
   public void setUp() 
   {
	  System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
	  driver = new FirefoxDriver();
//    System.setProperty("webdriver.chrome.driver", "driver/⁩chromedriver");    // specify path the the driver
//    driver = new ChromeDriver();    // create an instance of the web browser and open it
      driver.get(url);                // open the given url
   }

   @After
   public void teardown()
   {
	   driver.quit();                  // close the browser
   }

   @Test
   public void test_openURL()
   {
      assertEquals(driver.getTitle(), "Monster Slayer");	// check if we are on the right page
   }

   
   @Test
   public void test_startGameBtn()
   {
	  startGame();
	  assertEquals(getYourHealth(), 100);
	  assertEquals(getMonsterHealth(), 100);
   }
   
   @Test
   public void test_attackBtn()
   {
	   startGame();
	   attack();
	   assertTrue(getYourHealth() < 100);
	   assertTrue(getMonsterHealth() < 100);
   }
   
   @Test
   public void test_specialAttackBtn()
   {
	   startGame();
	   specialAttack();
	   assertTrue(getYourHealth() < 100);
	   assertTrue(getMonsterHealth() < 100);
   }
   
   	 @Test
   	 public void test_healBtn()
   	 {
   		int before_yH;
   		startGame();
   		// Make sure the health is lower than 90 so that we could check the heal button
   		attack();
   		attack();
   		attack();
   		before_yH = getYourHealth();
   		heal();
   		assertTrue(before_yH < getYourHealth());	 
   	 }
   	 
   	 @Test
   	 public void test_giveUpBtn()
   	 {
   		startGame();
   		attack();
   		giveUp();
   		assertEquals(checkRowsControl(), "START NEW GAME");
   	 }
   
   	@Test
   	public void test_refresh()
   	{
   		startGame();
   		driver.navigate().refresh();
   		assertEquals(checkRowsControl(), "START NEW GAME");
   	}
  
   
}
