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