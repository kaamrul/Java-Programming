//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 

class Account{
  int acc_no;
  String name;
  float amount;

  // method to initialize objects
  void insert(int a, String n, float amt){
    acc_no = a;
    name = n;
    amount = amt;
  }

  // deposite method
  void diposite(float amt){
    amount = amount + amt;
    System.out.println(amt+"deposited");
  }

  //withdraw method
  void withdraw(float amt){
    if(amount<amt){
      System.out.println("Insufficient Balance");
    }
    else{
      amount = amount - amt;
      System.out.println(amt+"withdrawn");
    }
  }

  // method to check the balance of the amount
  void checkBalance(){
    System.out.println("Balance is: "+amount);
  }

  // method to display the value of an objects
  void display(){
    System.out.println(acc_no+" "+name+" "+amount);
  }
}

class TestAccount{
  public static void main(String args[]){

    Account a1 = new Account();
    a1.insert(832345, "Kamrul", 1000);
    a1.display();
    a1.checkBalance();
    a1.diposite(40000);
    a1.checkBalance();
    a1.withdraw(15000);
    a1.checkBalance();
  }
}