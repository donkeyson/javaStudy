//Enum, 상수집합

public class Sample {
  enum CoffeeType {
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
  };
  
  public static void main(String[] args) {
    System.out.println(CoffeeType.AMERICANO); //AMERICANO
    System.out.println(CoffeeType.ICE_AMERICANO); //ICE_AMERICANO
    System.out.println(CoffeeType.CAFE_LATTE); //CAFE_LATTE
    
    //for 문
    for(CoffeType type: CoffeeType.values()) {
      System.out.println(type); //AMERICANO, ICE_AMERICANO, CAFE_LATTE
    }
  }
}
