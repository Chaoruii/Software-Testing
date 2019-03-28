package PJ;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver; // for Firefox 
import org.openqa.selenium.chrome.ChromeDriver; // for chrome

/**
 * 
 * Note: Test environment: Chrome Version 68, selenium 3.14.0, Java 8,
 * ChromeDriver 2.42
 */

public class EmptyTemplateForChrome_Test {
	private WebDriver driver;
	private String url = "http://Chaorui:8000";

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\selenium-java-3.14.0\\chromedriver.exe"); // specify
																														// path
																														// the
																														// the
																														// driver
		driver = new ChromeDriver(); // create an instance of the web browser and open it
		driver.get(url); // open the given url
	}

	@After
	public void teardown() {
		driver.quit(); // close the browser
	}

//   @Test
//   public void test_openURL()
//   {
//      assertEquals(driver.getTitle(), "Monster Slayer");	// check if we are on the right page
//   }
	@Test
	public void test_Base1() // test case #1
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("attack")).click();
//	   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 90);
		assertTrue("monsterHealth_max", y <= 97);
//	   System.out.println(x);
	}

	@Test
	public void test_Base2() // test case #2
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("special-attack")).click();
//	   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 80);
		assertTrue("monsterHealth_max", y <= 90);
	}

	@Test
	public void test_Base3() // test case #3
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
//	   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y == 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base4() // test case #4
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("give-up")).click();
//	   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base5() // test case #5
	{
		driver.findElement(By.id("start-game")).click();
//	   driver.findElement(By.id("attack")).click();
//	   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base6() // test case #6
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("attack")).click();
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base7() // test case #7
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("special-attack")).click();
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base8() // test case #8
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y == 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base9() // test case #9
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("give-up")).click();
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base10() // test case #10
	{
		driver.findElement(By.id("start-game")).click();
//	   driver.findElement(By.id("attack")).click();
		driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base11() // test case #11
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("attack")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));

	}

	@Test
	public void test_Base12() // test case #12
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("special-attack")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));
	}

	@Test
	public void test_Base13() // test case #13
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));

	}

	@Test
	public void test_Base14() // test case #14
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("give-up")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));
	}

	@Test
	public void test_Base15() // test case #15
	{
		driver.findElement(By.id("start-game")).click();
//		   driver.findElement(By.id("attack")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));
	}

	@Test
	public void test_Base16() // test case #16
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("attack")).click();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 90);
		assertTrue("monsterHealth_max", y <= 97);
	}

	@Test
	public void test_Base17() // test case #17
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("special-attack")).click();
//		   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 80);
		assertTrue("monsterHealth_max", y <= 90);
	}

	@Test
	public void test_Base18() // test case #18
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
//		   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 88);
		assertTrue("playerHealth_max", x <= 95);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y == 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base19() // test case #19
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("give-up")).click();
//		   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base20() // test case #20
	{
		driver.findElement(By.id("start-game")).click();
//		   driver.findElement(By.id("attack")).click();
//		   driver.navigate().refresh();
		WebElement element1 = driver.findElement(By.className("healthbar1"));
		String x_Str = element1.getText();
		int x = Integer.parseInt(x_Str);
		assertTrue("playerHealth_min", x >= 100);
		assertTrue("playerHealth_max", x <= 100);
		WebElement element2 = driver.findElement(By.className("healthbar2"));
		String y_Str = element2.getText();
		int y = Integer.parseInt(y_Str);
		assertTrue("monsterHealth_min", y >= 100);
		assertTrue("monsterHealth_max", y <= 100);
	}

	@Test
	public void test_Base21() // test case #21
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("attack")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));

	}

	@Test
	public void test_Base22() // test case #22
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));
	}

	@Test
	public void test_Base23() // test case #23
	{
		driver.findElement(By.id("start-game")).click();
		driver.findElement(By.id("heal")).click();
		driver.navigate().back();
		assertTrue(driver.getTitle() != ("Monster Slayer"));
	}

}
