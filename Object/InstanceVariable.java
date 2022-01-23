class Animal {
  String name; //인스턴스 변수
}

public class Sample {
  public static void main(String[] args) {
    Animal cat = new Animal();
    System.out.println(cat.name); //인스턴스 변수 출력. null.
  }  
}
