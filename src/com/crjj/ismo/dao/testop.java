package com.crjj.ismo.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.Operation;

class testop {

	@Test  
	void testsomm() {
		Operation o = new Operation(2,3);
		assertEquals(5, o.somm()); 
		
	}
	@Test
	void testsoustra() {
		Operation o = new Operation(4,2);
		assertEquals(2, o.soustraction());
	}

}
