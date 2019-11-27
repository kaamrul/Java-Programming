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

### What is a Class?
A class is a group of objects which have common properties. A class can be defined as a template/blueprint of object. It is a logical entry. It can't be physical.

A class in Java can contain:
- Fields
- Methods
- Constructor
- Blocks
- Nested Class and Interface

#### Syntex to declare a class
```.java
class class_name{
   field;
   method;
}
```

#### Object and Class Example: main within the class
```.java
//Java program to illustrate how to define a class and fields
// Defining a Student class
class Student{
   // defining fields
   int id; // field or data member or instance variable
   string name;

   //creating main method inside the Student class
   public static void main (String args[]){
      
      // creating an objects or instance
      Student s1 = new Student(); // creating an objects of Student

      // printing values of the object
      System.out.println(s1, id); // accessing member through reference variable
      System.out.println(s1, name);
   }
}

Output:
0
null
```

#### Object and Class Example: main outside the class
```.java
//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
 int id;  
 String name;  
}

//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
} 

Output:
0
null 
```

### 3 Ways to initialize object
- There are 3 ways to initialize object in Java.
   - By reference variable
   - By method
   - By constructor

### 1. Object and Class Example: Initialization through reference
Initializing an object means storing data into the object.

```.java
class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  
  Student s1=new Student(); // Creating objects 
  
  // initializing data
  s1.id = 10;  
  s1.name = "Kamrul";  
  
  System.out.println(s1.id+" "+s1.name); //printing members with a white space  
 }  
}  

Output:
10 Kamrul
```

We can also create multiple objects and store information in it through reference variable.

```.java
class Student{  
 int id;  
 String name;  
}  
class TestStudent3{  
 public static void main(String args[]){  
  
  //Creating objects  
  Student s1=new Student();  
  Student s2=new Student();

  //Initializing objects  
  s1.id=10;  
  s1.name="Kamrul";  
  s2.id=11;  
  s2.name="Hasan";

  //Printing data  
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
 }  
}
Output:
10 Kamrul
11 Hasan
```

### 2. Object and Class Example: Initialization through method
we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method. Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.

```.java
class Student{  
 int rollno;  
 String name;

 //create methods with parameter for storing data/initialize object  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }

 // create methods without parameter for displaying data 
 void displayInformation(){
   System.out.println(rollno+" "+name);
 }  
} 

class TestStudent4{  
 public static void main(String args[]){  
  
  // create objects
  Student s1=new Student();  
  Student s2=new Student();

  // initializing objects by calling insertRecord methods  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan"); 

  // displaying data by calling displayInformation methods 
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  

Output:
111 Karan
112 Aryan
```

### Object and Class Example: Employee
```.java
class Employee{

    // fields
    int id;  
    String name;  
    float salary;

    // create method with parameter for storing data/initialize object 
    void insert(int i, String n, float s){  
        id=i;  
        name=n;  
        salary=s;  
    }

   // create method for displaying data
    void display(){
      System.out.println(id+" "+name+" "+salary);
   }  
}

public class TestEmployee {  
public static void main(String[] args){ 

   // creating objects 
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();

    // initializing objects
    e1.insert(101,"Ajeet",45000);  
    e2.insert(102,"Irfan",25000);  
    e3.insert(103,"Nakul",55000);

    // printing data
    e1.display();  
    e2.display();  
    e3.display();  
   }  
}

Output:
101 Ajeet 45000
102 Irfan 25000
103 Nakul 55000
```
### Object and Class Example: Rectangle
```.java
class Rectangle{

// fields
  int length;  
  int width;

// create method with parameter for storing data/initialize object 
  void insert(int l, int w){  
    length=l;  
    width=w;  
  }

// create method for displaying data
  void calculateArea(){
    System.out.println(length*width);
  }  
}

class TestRectangle1{  
 public static void main(String args[]){

  // creating objects 
  Rectangle r1=new Rectangle();  
  Rectangle r2=new Rectangle();

  // initializing objects
  r1.insert(11,5);  
  r2.insert(3,15); 

  // printing data
  r1.calculateArea();  
  r2.calculateArea();  
  }  
}

Output:
55
45  
```
### Creating multiple objects by one type only
```.java
//Java Program to illustrate the use of Rectangle class which  
//has length and width data members  
class Rectangle{
 // fields  
 int length;  
 int width; 

 // creating method with parameter for storing data/initialize object 
 void insert(int l,int w){  
  length=l;  
  width=w;  
 } 

// creating method without parameter for displaying data
 void calculateArea(){
  System.out.println(length*width);
  }  
}  
class TestRectangle2{  
 public static void main(String args[]){ 

  //creating two objects
  Rectangle r1=new Rectangle(), r2=new Rectangle();   
  
  // initializing objects
  r1.insert(11,5);  
  r2.insert(3,15);

  // displaying data
  r1.calculateArea();  
  r2.calculateArea();  
  }  
}

Output:
55 
45
```

### Real World Example: Account
```.java
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 

class Account{
  int acc_no;
  String name;
  float amount;

  // method to initialize objects
  void insert(int a, String n, float amt){
    acc_no = a;
    name = n;
    amount = amt;
  }

  // deposite method
  void diposite(float amt){
    amount = amount + amt;
    System.out.println(amt+"deposited");
  }

  //withdraw method
  void withdraw(float amt){
    if(amount<amt){
      System.out.println("Insufficient Balance");
    }
    else{
      amount = amount - amt;
      System.out.println(amt+"withdrawn");
    }
  }

  // method to check the balance of the amount
  void checkBalance(){
    System.out.println("Balance is: "+amount);
  }

  // method to display the value of an objects
  void display(){
    System.out.println(acc_no+" "+name+" "+amount);
  }
}

class TestAccount{
  public static void main(String args[]){

    Account a1 = new Account();
    a1.insert(832345, "Kamrul", 1000);
    a1.display();
    a1.checkBalance();
    a1.diposite(40000);
    a1.checkBalance();
    a1.withdraw(15000);
    a1.checkBalance();
  }
}

Output:
832345 Kamrul 1000.0
Balance is: 1000.0
40000.0 deposited
Balance is: 41000.0
15000.0 withdrawn
Balance is: 26000.0
```

### 3. Object and Class Example: Initialization through a constructor

#### What is Constructor?
Constructor looks like a method but it is in fact not a method. Constructor name must be the same as its class name and it does not return any value. A Java constructor cannot be abstract, static, final, and synchronized.

- Default Constructor (no-arg constructor)
- Parameterized Constructor

#### Example of default constructor 1
```.java
//Java Program to create and call a default constructor  
class Bike1{  

//creating a default constructor  
Bike1(){
  System.out.println("Bike is created");
  }  
 
public static void main(String args[]){  

  //calling a default constructor  
  Bike1 b=new Bike1();  
  }  
} 

Output:
Bike is created 
```

#### Example of default constructor 2
```.java
// which display the dafault values
class Employee{
  int id;
  String name;

  // method to display the value of id and name
  void display(){
    System.out.println(id+" "+name);
  }

  public static void main (String args[]){
    // creating objects
    Employee e1 = new Employee();
    Employee e2 = new Employee();

    // displaying value of the objects
    e1.display();
    e2.display();
  }
}

Output:
0 null
0 null
```

#### Example of Parameterized constructor
```.java
class Employee{
  int id;
  String name;

  // creating a parameterized constructor
  Employee(int i, String n){
    id = i;
    name = n;
  }

  // method to display the value of id and name
  void display(){
    System.out.println(id+" "+name);
  }

  public static void main (String args[]){
    // creating objects and passing values
    Employee e1 = new Employee(111, "Bulbul");
    Employee e2 = new Employee(112, "Foni");

    // calling method to display value of the objects
    e1.display();
    e2.display();
  }
}

Output:
111 Bulbul
112 Foni
```

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

### Constructor Overloading in Java
Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

#### Example of Constructor Overloading
```.java
class Employee{
  int id;
  String name;
  int age

  // creating two arg constructor
  Employee(int i, String n){
    id = i;
    name = n;
  }

  //creating three arg constructor
  Employee(int i, String n, int a){
    id = i;
    name = n;
    age = a;
  }

  // method to display the value of id and name
  void display(){
    System.out.println(id+" "+nam+ " "+age);
  }

  public static void main (String args[]){
    // creating objects and passing values
    Employee e1 = new Employee(111, "Bulbul");
    Employee e2 = new Employee(112, "Foni", 27);

    // calling method to display value of the objects
    e1.display();
    e2.display();
  }
}

Output:
111 Bulbul 0
112 Foni 27
```

### Java Copy Constructor
There is no copy constructor in Java.There are many ways to copy the values of one object into another in Java. They are:

- By constructor
- By assigning the values of one object into another
- By clone() method of Object class

Copy the values of one object into another using Java constructor.

```.java
//Java program to initialize the values from one object to another object.  
class Employee{
  int id;
  String name;

  // creating two arg constructor
  Employee(int i, String n){
    id = i;
    name = n;
  }

  //creating three arg constructor
  Employee(Employee e){
    id = e.id;
    name = e.name;
  }

  // method to display the value of id and name
  void display(){
    System.out.println(id+" "+name);
  }

  public static void main (String args[]){
    // creating objects and passing values
    Employee e1 = new Employee(111, "Bulbul");
    Employee e2 = new Employee(e1);

    // calling method to display value of the objects
    e1.display();
    e2.display();
  }
}

Output:
111 Bulbul
111 Bulbul
```

## Happy Journey 