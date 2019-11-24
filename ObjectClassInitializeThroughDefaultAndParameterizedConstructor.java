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