//모든 요소 출력하기 
String[] numbers = {'one', 'two', 'three'};
for(String number: numbers) {
  System.out.println(number);
}

//예시
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList('one', 'two', 'three'));
    for (String number : numbers) {
      System.out.println(number);
    }
  }
}
