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