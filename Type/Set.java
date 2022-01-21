//집합자료형

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>(Arrays.asList('H', 'e', 'l', 'l', 'o'));
    System.out.println(set); // [e, H, l, o]. 중복 값 제거
    
    //교집합
    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    
    HashSet<Integer> intersection = new HashSet<>(s1); //s1으로 intersection 생성
    intersection.retainAll(s2); //교집합
    System.out.println(intersection); //[4, 5, 6]
    
    //합집합
    HashSet<Integer> union = new HashSet<>(s1); //s1으로 union 생성
    union.addAll(s2); //addAll 메소드
    System.out.println(union); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    //차집합
    HashSet<Integer> substract = new HashSet<>(s1); //s1으로 substract 생성
    substract.removeAll(s2); //removeAll 메소드
    System.out.println(substract); // [1, 2, 3]
  }
}

public class Sample2 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    //값 추가하기(add)
    set.add('Jump');
    set.add('To');
    set.add('Java');
    System.out.println(set); // [Java, To, Jump] 출력. 순서가 없다.
    
    //여러 값 추가하기(addAll)
    set.addAll(Arrays.asList('Go', 'Python'));
    System.out.println(set); // [Java, To, Jump, Python, Go]
    
    //특정 값 제거하기(remove)
    set.remove('To');
    System.out.println(set); //[Java, Jump, Python, Go]
  }
}
