abstract class operator 
{

abstract double calculate(double number1, double number2);

}
/**  these classes extends the abstract class operator for every operator
 * every subclass below have the same method as the superclass operator,
 * thats why we have the override symbol

**/

  class addition extends operator{

 // method to give the sum. 

 @Override
  double calculate(double number1,double number2) {
    return number1+number2;
  }
}
