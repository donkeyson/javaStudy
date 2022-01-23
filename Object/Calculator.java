class Calculator {
  int result = 0;
  
  int add(int num) {
    result += num;
    return result;
  }
}

public class Sample {
  public static void main(String[] args) {
    Calculator cal1 = new Calculator(); //계산기 1
    Calculator cal2 = new Calculator(); //계산기 2
    
    System.out.println(cal1.add(3));
    System.out.println(cal2.add(4)); //7
    
    System.out.println(cal1.add(3));
    System.out.println(cal2.add(7)); //10
