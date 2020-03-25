package com.epam.tddjunit.tddjunit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveATest {
	/* ABCD -> BCD
	 * AACD -> CD
	 * BACD -> BCD
	 * BBAA -> BBAA
	 * A -> ""
	 * "" -> ""
	 */
	RemoveA removea;
	@BeforeEach
	void setUp(){
		removea=new RemoveA();
	}
	@Test
	public void testFirstA() {
		setUp();
		assertEquals("BCD",removea.remove("ABCD"));
	}
	@Test
	public void test2As(){
		setUp();
		assertEquals("CD",removea.remove("AACD"));
	}
	@Test
	public void testSecondA(){
		setUp();
		assertEquals("BCD",removea.remove("BACD"));
	}
	@Test
	public void testNoAs(){
		setUp();
		assertEquals("BBAA",removea.remove("BBAA"));
	}
	@Test
	public void testOneA(){
		setUp();
		assertEquals("",removea.remove("A"));
	}
	@Test
	public void testEmpty(){
		setUp();
		assertEquals("",removea.remove(""));
	}
	@Test
	public void test(){
		setUp();
		assertEquals("BBAA",removea.remove("AABBAA"));
	}
}
