//추상클래스로 인터페이스 대체
//클래스, 인터페이스의 기능 둘 다 가짐.
//인터페이스와 달리 객체변수, 생성자. private 메서드 등을 가질 수 있다.

abstract class Predator extends Animal {
  abstract String getFood();
  
  void printFood() {
    System.out.println('my food is %s\n', getFood());
  }
  
  static int LEG_COUNT = 4; //추상 클래스 상수는 static 선언 필요
  
  //스태틱 메서드 (인터페이스명.스태틱메서드명)
  static int speed() {
    return LEG_COUNT * 30
  }
}

interface Barkable {
  void bark();
}


class Animal {
  String name;
  
  void setName(String name) {
    this.name = name;
  }
}

//implements
class Tiger extends Predator implements Barkable {
  public String getFood() { //인터페이스 메소드는 public으로 구현
    return 'apple';
  }
  
  public void bark() {
    System.out.println('어흥');
}
  
class Lion extends Predator implements Barkable {
  public String getFood() {
    return 'banana';
  }
  public void bark() {
    System.out.println('으르렁');
}

class ZooKeeper {
  void feed(Predator predator) { //일일이 지정 불필요
    System.out.println('feed '+predator.getFood());
  }
}


class Bouncer {
  void barkAnimal(Barkable animal) {
    animal.bark();
  }
}
  
public class Sample {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger); //feed apple
    zooKeeper.feed(lion); //feed banana
    
    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger); //어흥
    bouncer.barkAnimal(lion); //으르렁
  }
}
