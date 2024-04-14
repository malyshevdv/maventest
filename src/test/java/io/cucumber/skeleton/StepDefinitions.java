package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDefinitions {
	

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    
    @When("I wait {int} hour")
    public void www(int hours) throws MalformedURLException {
    	
    	//Адрес сайта для тестирования
    	String myURL = "https://www.selenium.dev/selenium/web/web-form.html";

    	ChromeOptions options = new ChromeOptions();
    	String DOCKER0_IP = "MYSELENIUM"; //- имя контейнера с SELENIUM  
    	String port = "4444";
    	
    	URL gridUrl = new URL("http://" + DOCKER0_IP + ":" + port);
    	RemoteWebDriver driver = new RemoteWebDriver(gridUrl, options);
    	
    	 	 
    	driver.get(myURL); //открываем страницу
    	
    	String myTitle = driver.getTitle();
    	System.out.println(myTitle);
    	assertEquals(myTitle, "Web form");
    }
    
    @Then("my belly should growl")
    public void wwwd() {
        
        
    }
    
    
    
    
    
    
 /*   
    @Given("I have {int} cukes in my denis")
    public void I_have_cukes_in_my_denis(int cukes) {
        Denis belly = new Denis();
        belly.eat(cukes);
    }
    
	@Given("I have {int} cukes in my kelly")
    public void I_have_cukes_in_my_kelly(int cukes) {
	   Kelly belly = new Kelly();
        belly.eat(cukes);
    }
*/
    
}


