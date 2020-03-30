package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Snapdeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\WindowsHandling\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.snapdeal.com/");
	
	WebElement search=d.findElement(By.id("inputValEnter"));
    search.sendKeys("iphones 7 mobiles");
    
    WebElement searchbtn=d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
    searchbtn.click();
    
    WebElement iph=d.findElement(By.xpath("(//p[@class='product-title '])[1]"));
    iph.click();
   
    Set<String> allWinid =d.getWindowHandles();
    List<String>li=new ArrayList<>();
    li.addAll(allWinid);
    String id=li.get(1);
    d.switchTo().window(id);
    
    WebElement cart=d.findElement(By.id("add-cart-button-id"));
    cart.click();
    Thread.sleep(3000);
    WebElement t=d.findElement(By.xpath("//div[text()='You Pay: ']"));
    String n=t.getText();
    System.out.println(n);
    		}
}
