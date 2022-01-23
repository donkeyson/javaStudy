class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    void sleep() { //오버라이딩
      System.out.println(this.name + ' zzz in house');
    }
}

public class Sample {
  public static void main(String[] args) {
    HouseDog houseDog = new HouseDog();
    houseDog.setName('happy');
    houseDog.sleep(); //happy zzz in house
  }
}
