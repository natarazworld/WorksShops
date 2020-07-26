package com.nt.test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.nt.basics.MathOperations;

public class MathOperationsTest {

	@Test
	@Ignore
	public  void testPositives() {
		int expected=300;
		int actual=new MathOperations().sum(100, 200);
		assertEquals("test positives",expected,actual);
	}
	
	@Test
	public  void testNegatives() {
		int expected=-700;
		int actual=new MathOperations().sum(-100, -600);
		assertEquals("test negatives",expected,actual);
	}
	
	@Test
	public  void testMixed() {
		int expected=100;
		int actual=new MathOperations().sum(-100, 200);
		assertEquals("test mixed",expected,actual);
	}
	
	@Test
	public  void testZeros() {
		int expected=0;
		int actual=new MathOperations().sum(0, 0);
		assertEquals("test zero",expected,actual);
	}
	
}
