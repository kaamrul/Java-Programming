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