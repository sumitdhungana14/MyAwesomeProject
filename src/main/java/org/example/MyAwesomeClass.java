package org.example;

public class MyAwesomeClass {

    // Attributes (or fields) of the class
    private String name;
    private int value;

    // Constructor
    public MyAwesomeClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Method that demonstrates some functionality
    public void printDetails() {
        System.out.println("Name: " + name + ", Value: " + value);
    }

    // Main method for testing
    public static void main(String[] args) {
        MyAwesomeClass awesomeObject = new MyAwesomeClass("ExampleName", 42);
        awesomeObject.printDetails();
    }

}
