package com.boot;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.boot.controller.HomeController;
import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
	@Test
    public void testApp(){
     HomeController homeController = new HomeController();
     String result = homeController.home();
     System.out.println(result);
     assertEquals(result, "Hello Brian");
    }
}
