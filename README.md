# Java-Programming

## OOP Concepts in JAVA

- Object
- Class
- Constructor in Java
- Object Oriented Programming Features
	- Abstruction
	- Encapsulation
	- Inheritance
	- Polymorphism
- Abstract Class and Methods
- Interfaces in Java

### What is an Object?
```
Object: is a bundle of data and its behaviour(often known as methods).

Objects have two characteristics: They have states and behaviors.

Examples of states and behaviors
Example 1:
Object: House
State: Address, Color, Area
Behavior: Open door, close door
```
*So if I had to write a class based on states and behaviours of House. I can do it like this: States can be represented as instance variables and behaviours as methods of the class. We will see how to create classes in the next section of this guide.*

### What is a Class?
A class can be defined as a template/blueprint of object.

#### Example
```.java
class House {
   //this are state...
   String address;
   String color;
   double area;

   //this are behavior...
   void openDoor() {
      //Write code here
   }
   void closeDoor() {
      //Write code here
   }
 ...
 ...
}
```
**Note:** As we have seen above, the states and behaviors of an object, can be represented by variables and methods in the class respectively.

### What is Constructor?
Constructor looks like a method but it is in fact not a method. It’s name is same as class name and it does not return any value. 

- Default Constructor
- Parameterized Constructor
- No - Arg Constructor

#### Example of Constructor 1

```.java
public class Dog {
   //fields (or instance variable)
   String Dname;
   int Dage;

   // constructor
   Dog(String name, int age){
      this.Dname = name;
      this.Dage = age;
   }
   public static void main(String args[]){
      //Creating objects
      Dog obj1 = new Dog("Buddy", 5);
      Dog obj2 = new Dog("Teddy", 3);

     //Accessing object data through reference
     System.out.println(obj1.Dname+" "+obj1.Dage);
     System.out.println(obj2.Dname+" "+obj2.Dage);
   }
}

Output:
Buddy 5
Teddy 3
```
#### Example of Constructor 2

```.java
public class ConstructorExample {

   int age;
   String name;
   
   //Default constructor
   ConstructorExample(){
   this.name="Chaitanya";
   this.age=30;
   }
   
   //Parameterized constructor
   ConstructorExample(String n,int a){
   this.name=n;
   this.age=a;
   }
   public static void main(String args[]){
   ConstructorExample obj1 = new ConstructorExample(); // call default constructor

   ConstructorExample obj2 = new ConstructorExample("Steve", 56); // call parameterized constructor

   System.out.println(obj1.name+" "+obj1.age);
   System.out.println(obj2.name+" "+obj2.age);
   }
}

Output:

Chaitanya 30
Steve 56
```



