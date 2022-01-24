import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample {
  public class Sample {
    public static void main(String[] args) throws IOException {
      InputStrea in = System.in;
      InputStreamReader reader = new InputStreamReader(in);
      char[] a = new char[3]; //char 배열 샤용 가능
      reader.read(a);
      
      System.out.println(a); //
