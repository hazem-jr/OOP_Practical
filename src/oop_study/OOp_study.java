package oop_study;

// inheritance 
class employee {
    float salary  = 2000 ;
} 
class programmer extends employee  {
    int bonus = 300 ;
}
class java_programmer extends programmer {
    int bonus2 = 100 ;
}
// java not supported multiple inheritence ..
//class multi extends employee , programmer {
//
//}

// Aggregation
class Operation{
    int square(int n ){
        return n*n  ; 
    }
}
class Circle {
     double PI = 3.14 ;
     Operation op  ;
     
    double area(int radius ){
     op = new Operation() ;
     int rsquare  = op.square(radius) ;
     return PI * rsquare ; 
    } 
}
// methods overloaading 
// two functions withthe same names and differnt in the number of parmeters 
// ot to change the data type of the parameters 
class Adder {
    static int sum(int a , int b ){
         return a+b  ;
    }
    static int sum(int a , int b , int c){
        return a + b + c  ;
    } 
    static double sum(double a , double b ){
        return a + b  ;        
    }
}

// methods overrinding 
// bank example 
class Bank {                  // parent class 
    int getRateOfInterest(){
        return 0 ;
    }
}
//parrent class 
class CIB extends Bank{
    // oveerride the method 
    int getRateOfInterest(){
        return 7 ;
    }
}
//parrent class 
class QNB extends Bank{
    // oveerride the method 
    int getRateOfInterest(){
        return 8 ;
    }
}
// cannot override static method 

// Super keyword 
class Animal{ 
    String color = "red" ;
    
}
class Dog extends Animal{
    String color = "green";
    void printColor(){
        System.out.println(color); // Print the color of dog class
        System.out.println(super.color); // print the color of the animal class
    } 
}

// super with instructors 
// the super class instructor will be called first then the child 
class Person{ 
    Person(){
        System.out.println("Person is created ");
    }
    
}
class Ahmed extends Person{
    Ahmed(){
        System.out.println("Ahmed is created ");
    } 
}

public class OOp_study {

    public static void main(String[] args) {
// inheretance 
      programmer p  = new programmer() ;
      System.out.println(p.salary + p.bonus) ;
      
      java_programmer jp = new java_programmer() ;
      System.out.println(jp.bonus2) ;

// aggregation 
      Circle c = new Circle() ;
      System.out.println(c.area(10)) ;
    }
// overoad the main method
// but only the main method with the (String[] args ) is called
// cannot override the main methos becouse it is a static method     
   public static void main(String args){       
    
}
}