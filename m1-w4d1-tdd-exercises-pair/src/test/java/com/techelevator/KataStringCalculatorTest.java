package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	KataStringCalculator sut = new KataStringCalculator() ;
	
	@Test 
	public void test0() {		
		assertEquals(0 , sut.convertStringToInt(""));		
	}
	
	@Test
	public void test1() {	
		assertEquals(1, sut.convertStringToInt("1"));
	}
	
	@Test
	public void test2numberString() {		
		assertEquals(3, sut.convertStringToInt("1,2"));
	}
	
	@Test
	public void test3numberString() {		
		assertEquals(6, sut.convertStringToInt("1,2,3"));
	}
	
	@Test
	public void testWholeBunchaNumbers() {		
		assertEquals(45, sut.convertStringToInt("1,2,3,4,5,6,7,8,9"));
	}
	
	@Test
	public void testSplitterVariable() {		
		assertEquals(3, sut.convertStringToInt("1,2"));
	}
	
	@Test
	public void testSplitterVariableOther() {		
		assertEquals(3, sut.convertStringToInt("1!2"));
	}
	
	@Test
	public void testSplitterVariableWithLineBreaks() {		
		assertEquals(3, sut.convertStringToInt("1\n2"));
	}
	@Test
	public void testSplitterVariableBonus() {		
		assertEquals(3, sut.convertStringToInt("1;2"));
	}
}
