package com.lti.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SuiteTest1 {
public String message="Raj";

JUnitMessage junitMessage=new JUnitMessage(message);

@Test
public void testJUnitMessage()
{
 System.out.println("JUnit Message is printing");
 junitMessage.printMessage();
}

@Test
public void testJUnitHiMessage()
{
 message="Hi"+message;
 System.out.println("Junit Hi Message is printing");
 assertEquals(message, junitMessage.printHiMessage());
 System.out.println("Suite Test 1 is successful"+message);
}
}
