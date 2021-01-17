package com.temp.junit.temptestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class FirstTestTest 
{
	
	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all First test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each First test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each First test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all First test methods");
    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test First method");
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test First method");
    }
    
    @Test
    @DisplayName("Add")
    void addTest() {
    	int c = FirstTest.add(10, 20);
    	assertEquals(30, 30);
    }
    
    @Test
    @DisplayName("Add")
    void subTest() {
    	int c = FirstTest.add(20, 20);
    	assertEquals(0, 0);
    }

}
