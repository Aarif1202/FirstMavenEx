package com.lti.demos;
 import java.util.ArrayList;

import org.junit.jupiter.api.Assertions ;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCasesEx {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
//	ctr+shif+O 

	@Test
	public void testCase1() {
		Assertions.assertEquals("HELLO","HELLO") ;
		Assertions.assertEquals(500,200+300 ,"addition passed") ;
	}
	@Test
	public void testAdd() {
		Calculator c= new Calculator() ;
		int r= c.add(300,200) ;
		Assertions.assertEquals(500, r);//
	}
	
	
	
	@Test
	void testAssertEqual() {
		Assertions.assertEquals("ABC", "ABC");
		Assertions.assertEquals(20, 20, "optional assertion message");
		Assertions.assertEquals(2 + 2, 4);
	}

	@Test
	void testAssertFalse() {
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
	}

	
//	@Disabled 
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 Assertions.assertNull(str1); //str 1 is null -condiction is ok tes case ok
		 Assertions.assertNotNull(str2);	//str2 -notnull ? --condoction is ok ---test is ok 
	}

	@Test 
	public void testEmptyArrayList() {
		ArrayList<Integer> a1 =new ArrayList<Integer>() ;
		Assertions.assertEquals(0, a1.size());
		a1.add(100);
		
	}
}
