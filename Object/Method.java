//클래스
class Animal {
  String name; //인스턴스 변수
  
  public void setName(String name) { //void == 리턴값 없음
    this.name = name;
  }
}

public class Sample {
  public static void main (String[] args) {
    Animal cat = new Animal();
    cat.setName('body'); //메소드 호출
    System.out.println(cat.name); //body
  }
}
