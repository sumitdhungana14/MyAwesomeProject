package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MyAwesomeClassTest {

    private MyAwesomeClass myAwesomeClass;

    @BeforeEach
    void setUp() {
        myAwesomeClass = new MyAwesomeClass("InitialName", 10);
    }

    @Test
    void testConstructor() {
        MyAwesomeClass instance = new MyAwesomeClass("TestName", 25);
        assertEquals("TestName", instance.getName());
        assertEquals(25, instance.getValue());
    }

    @Test
    void testGetName() {
        assertEquals("InitialName", myAwesomeClass.getName());
    }

    @Test
    void testSetName() {
        myAwesomeClass.setName("NewName");
        assertEquals("NewName", myAwesomeClass.getName());
    }

    @Test
    void testGetValue() {
        assertEquals(10, myAwesomeClass.getValue());
    }

    @Test
    void testSetValue() {
        myAwesomeClass.setValue(30);
        assertEquals(30, myAwesomeClass.getValue());
    }

    @Test
    void testPrintDetails() {
        // Redirect system output to capture the printDetails() output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myAwesomeClass.printDetails();

        assertEquals("Name: InitialName, Value: 10\n", outContent.toString());

        // Reset the system output
        System.setOut(System.out);
    }
}
