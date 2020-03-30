package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTechnology {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\WindowsHandling\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.greenstechnologys.com/");
    Actions action=new Actions(d);
    
    WebElement Cus=d.findElement(By.xpath("//a[@href='contact.php']"));
	action.contextClick(Cus).perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> allwinh = d.getWindowHandles();
	List<String>li=new ArrayList();
	li.addAll(allwinh);
	d.switchTo().window(li.get(0));
	
	
	
}
}
