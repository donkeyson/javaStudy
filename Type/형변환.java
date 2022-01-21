public class Sample {
  public static void main(String[] args) {
    //정수로 형변환
    String num = '123';
    int n = Integer.parseInt(num);
    System.out.println(n); // 123(integer)
    
    //문자로 형변환
    String num = '' + n;
    System.out.println(num); // 123(str)
    
    //다른 방법
    int n = 123;
    String num1 = String.valueOf(n);
    String num2 = Integer.toString(n);
    
    //소숫점이 포함된 경우
    String num = '123.456';
    double d = Double.parseDouble(num);
    
    //정수 실수로
    int n1 = 123;
    double d1 = n1;
    
    //실수 정수로
    double n1 = 123.456;
    int n2 = (int) d2; //정수형으로 캐스팅
    
    //실수 형태의 문자열을 정수로 변경하려고 하면 오류 발생
    
    //final
    final int n = 123; //final로 설정하면 값 바꿀 수 없다.
    final ArrayList<String> a = new ArrayList<>(Arrays.asList('a', 'b')); //a값 바꿀 수 없다. a.add, a.remove는 가능
    
  }
}
