//인터페이스
interface Predator {
  String getFood();
}

class Animal {
  String name;
  
  void setName(String name) {
    this.name = name;
  }
}

//implements
class Tiger extends Animal implements Predator {
  public String getFood() { //인터페이스 메소드는 public으로 구현
    return 'apple';
  }
}
class Lion extends Anmimal implements Predator {
  public String getFood() {
    return 'banana';
}

class ZooKeeper {
  void feed(Predator predator) { //일일이 지정 불필요
    System.out.println('feed '+predator.getFood());
  }
}

public class Sample {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger); //feed apple
    zooKeeper.feed(lion); //feed banana
  }
}
