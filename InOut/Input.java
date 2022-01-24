//콘솔 입력
import java.io.IOException; //예외처리
import java.io.InputStream;

public class Sample {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    
    int a;
    a = in.read(); //아스키 코드값
    
    System.out.println(a); //
  }
}
