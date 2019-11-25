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