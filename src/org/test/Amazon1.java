package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Windows Handling\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.com/");
	
	WebElement search = d.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("iphones8");
    
    WebElement searchbtn = d.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
    searchbtn.click();
    
    WebElement ph = d.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
    ph.click();
    WebElement addli = d.findElement(By.id("add-to-wishlist-button-submit"));
    addli.click();
    
    WebElement email = d.findElement(By.id("ap_email"));
    email.sendKeys("sivag918@gmail.com");
    
    WebElement contbtn = d.findElement(By.id("continue"));
    contbtn.click();
    
    WebElement pass = d.findElement(By.id("ap_password"));
    pass.sendKeys("sivaamazon");
    
    WebElement signinbtn = d.findElement(By.id("signInSubmit"));
    signinbtn.click();
    
    WebElement cart = d.findElement(By.id("nav-cart"));
    cart.click();
    
    WebElement cost = d.findElement(By.xpath("(//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign'])[1]"));
    String t=cost.getText();
    System.out.println(t);
}
}
