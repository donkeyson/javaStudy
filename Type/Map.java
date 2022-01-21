//딕셔너리와 유사
//HashMap
//put
import java.util.HashMap;

public class Sample {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put('people', '사람'); //key, value
    map.put('baseball', '야구');
  }
}

//get
System.out.println(map.get('people')); //'사람' 출력

//containsKey, 해당 키 존재 여부
System.out.println(map.containsKey('people')); //true

//remove
System.out.println(map.remove('people')); //key, value 쌍 삭제 이후 value('사람') 출력

//size
System.out.println(map.size()); //Map 개수 리턴. 1

//keySet, Map의 모든 Key값, Set 자료형으로 리턴
System.out.println(map.keySet()); //[baseball] 출력
List<String> keyList = new ArrayList<>(map.keySet()); //list로 변형
