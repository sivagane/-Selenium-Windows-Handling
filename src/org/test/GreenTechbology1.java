package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTechbology1 {
public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Windows Handling\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.greenstechnologys.com/");
	
	Actions a= new Actions(d);
	WebElement contactbtn = d.findElement(By.xpath("//a[@href='contact.php']"));
    a.contextClick(contactbtn).perform();
    Robot r= new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Set<String> allwinhb = d.getWindowHandles();
    List<String>li=new ArrayList();
    li.addAll(allwinhb);
    d.switchTo().window(li.get(0));
    
    
    WebElement careerbtn = d.findElement(By.xpath("(//a[@href='careers.html'])[1]"));
    careerbtn.click();
    TakesScreenshot ts=(TakesScreenshot)d;
    
    File src = ts.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\gr.png");
    FileUtils.copyFile(src,des);
    
    
}
}
