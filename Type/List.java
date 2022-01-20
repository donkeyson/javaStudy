//ArrayList
import java.util.ArrayList;

public class Sample {
  public static void main(String[] args) {
    ArrayList pitches = new ArrayList(); //ArrayList 생성
    pitches.add('138');
    pitches.add('129');
    pitches.add('142');
  }
}

//get
System.out.println(pitches.get(1)); //129

//size
System.out.println(pitches.size()); //개수

//contains
System.out.println(pitches.contains('142')); //요소 포함 여부

//remove
System.out.println(pitches.remove('129')); //129 삭제됨. 'true' returned

System.out.println(pitches.remove(0)); //0인덱스 값 삭제. 삭제항목 138 returned

//Generics
ArrayList<String> pitches = new ArrayList<>(); //String 자료형만 담을 수 있다.

//이미 존재하는 배열로 ArrayList 생성하기 
import java.until.Arrays;

public class Sample {
  public static void main(String[] args) {
    String[] data = {'138', '129', '142'}; //배열
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
    System.out.println(pitches); //[138, 129, 142] 출력
  }
}
//배열은 삭제된 데이터의 빈공간을 그대로 둔다. 리스트는 빈 공간을 채운다. 

//String.join('구분자', 리스트 객체)
public class Sample {
  public static void main(String[] args) {
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList('138', '129', '142'));
    String result = String.join(',', pitches);
    System.out.println(result); //138,129,142
  }
}

//정렬
import java.util.Comparator;

public class Sample {
  public static void main(String[] args) {
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList('138', '129', '142'));
    pitches.sort(Comparator.naturalOrder()); //오름차순
    System.out.println(pitches); // [129, 138, 142]
  }
}
