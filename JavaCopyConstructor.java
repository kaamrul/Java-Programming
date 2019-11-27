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
    Employee e2 = new Employee(112, "Foni");

    // calling method to display value of the objects
    e1.display();
    e2.display();
  }
}
