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
    HouseDog(String name) { //생성자
      this.setName(name);
    }
  
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog('happy'); //생성자에 입력
        System.out.println(dog.name); //happy
        houseDog.sleep(); //happy zzz in house
        houseDog.sleep(3); //happy zzz in house for 3 hours
    }
}
