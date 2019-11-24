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