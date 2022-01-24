import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
    
    String a = br.readLine(); //한 줄 읽기
    System.out.println(a); //3 BYTE 이상 입출력 가능
  }
}
