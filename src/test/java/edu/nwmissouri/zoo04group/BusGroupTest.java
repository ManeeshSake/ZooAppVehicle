/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author s545236
 */
public class BusGroupTest {
    
    public BusGroupTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class BusGroup.
     */
    @Test
    public void testCreate() {
        int expectedSize = 1;
        int actualSize = BusGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class BusGroup.
     */
    @Test
    public void testRun() {
        BusGroup.create();
        BusGroup.run();
        assertTrue(true);
    }
    
}
