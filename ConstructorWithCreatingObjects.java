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
