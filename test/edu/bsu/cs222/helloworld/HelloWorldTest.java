package edu.bsu.cs222.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        String response = helloWorld.sayHello();
        Assert.assertEquals("The object should say hello","Hello",response);
    }
}
