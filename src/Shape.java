//shape is going to be the absttact class
// If a class contains at least one abstract method then that class has to be declared as abstract class
// "abstract" in between the access modifier and the class
// Abstract class can be inherited
public abstract class Shape {
    // Abstract class can have instance variable/attributes
    String color;

    // Abstract class can have constructors
    Shape() {
        this.color = "";
    }


    Shape(String color) {
        this.color = color;
    }

    // Abstract class can have concrete methods (defined methods) - You know that the method will do

    public void display() {
        System.out.println("Color is: " + this.color);
    }

    public abstract void calculateArea();
}

