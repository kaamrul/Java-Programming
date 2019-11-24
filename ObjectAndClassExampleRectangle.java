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