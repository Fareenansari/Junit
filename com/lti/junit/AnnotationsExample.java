package com.lti.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsExample {

		private ArrayList<String> list;
		
		@BeforeClass
		public static void m1() {
			System.out.println("Using @BeforeClass, executed before all the test"+"cases");
	}
		@Before
		public void m2() {
			
		list= new ArrayList<String>();
		System.out.println("Using @Before annotations, executed before each"+"test Cases");
		}
		@AfterClass
		public void m3() {
			System.out.println("Using @AfterClass, executed after each test cases");
		}
		@After
		public void m4() {
			System.out.println("Using @After, executed after each test cases");
		}
		@Test
		public void m5() {
			list.add("Test");
			assertFalse(list.isEmpty());
			assertEquals(1,list.size());
			System.out.println("In Test method ");
		}
		
		@Ignore
		public void m6() {
			System.out.println(" Using @Ignore, this execution is ignored");
		}
		@Test(timeout =10)
		public void m7() {
			System.out.println("Using @Test(timeout),it can be used to enforce timeout");
		}
		@Test( expected = NoSuchMethodException.class)
		public void m8() {
			System.out.println("Using @Test(expected), it will check for " + "Specified exception during its execution");
		}
}
