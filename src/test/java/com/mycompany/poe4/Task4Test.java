/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class Task4Test {
    
    public Task4Test() {
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
     * Test of validateDescription method, of class Task4.
     */
    @Test
    public void testValidateDescription() {
        System.out.println("validateDescription");
        String description = "";
        String expResult = "";
        String result = Task4.validateDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskName method, of class Task4.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task4 instance = null;
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskName method, of class Task4.
     */
    @Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        String taskName = "";
        Task4 instance = null;
        instance.setTaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task4.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task4 instance = null;
        int expResult = 0;
        int result = instance.getTaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskNumber method, of class Task4.
     */
    @Test
    public void testSetTaskNumber() {
        System.out.println("setTaskNumber");
        int taskNumber = 0;
        Task4 instance = null;
        instance.setTaskNumber(taskNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescription method, of class Task4.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        Task4 instance = null;
        String expResult = "";
        String result = instance.getTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDescription method, of class Task4.
     */
    @Test
    public void testSetTaskDescription() {
        System.out.println("setTaskDescription");
        String taskDescription = "";
        Task4 instance = null;
        instance.setTaskDescription(taskDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperDetails method, of class Task4.
     */
    @Test
    public void testGetDeveloperDetails() {
        System.out.println("getDeveloperDetails");
        Task4 instance = null;
        String expResult = "";
        String result = instance.getDeveloperDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeveloperDetails method, of class Task4.
     */
    @Test
    public void testSetDeveloperDetails() {
        System.out.println("setDeveloperDetails");
        String developerDetails = "";
        Task4 instance = null;
        instance.setDeveloperDetails(developerDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDuration method, of class Task4.
     */
    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task4 instance = null;
        int expResult = 0;
        int result = instance.getTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDuration method, of class Task4.
     */
    @Test
    public void testSetTaskDuration() {
        System.out.println("setTaskDuration");
        int taskDuration = 0;
        Task4 instance = null;
        instance.setTaskDuration(taskDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task4.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task4 instance = null;
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskID method, of class Task4.
     */
    @Test
    public void testSetTaskID() {
        System.out.println("setTaskID");
        String taskID = "";
        Task4 instance = null;
        instance.setTaskID(taskID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatus method, of class Task4.
     */
    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task4 instance = null;
        String expResult = "";
        String result = instance.getTaskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskStatus method, of class Task4.
     */
    @Test
    public void testSetTaskStatus() {
        System.out.println("setTaskStatus");
        String taskStatus = "";
        Task4 instance = null;
        instance.setTaskStatus(taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
