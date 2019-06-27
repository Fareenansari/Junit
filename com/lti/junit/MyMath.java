package com.lti.junit;

import org.junit.Test;

public class MyMath {
		public MyMath() {
			
		}
		@Test
		int sum(int[] numbers) {
			
			int sum=0;
			for(int i: numbers) {
				
				sum+=i;
			}
			return sum;
		}
}
