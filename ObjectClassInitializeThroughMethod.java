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