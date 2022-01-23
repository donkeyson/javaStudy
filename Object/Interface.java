//인터페이스
interface Predator {
  String getFood();
  
  //디폴트 메서드
  default void printFood() {
    System.out.println('my food is %s\n', getFood());
  }
  
  int LEG_COUNT = 4; //인터페이스 상수
  
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
class Tiger extends Animal implements Predator, Barkable {
  public String getFood() { //인터페이스 메소드는 public으로 구현
    return 'apple';
  }
  
  public void bark() {
    System.out.println('어흥');
}
  
class Lion extends Anmimal implements Predator, Barkable {
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
