import java.io.IOException;
import java.io.InputStream;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a = new byte[3];
        in.read(a); //abc

        System.out.println(a[0]); //97
        System.out.println(a[1]); //98
        System.out.println(a[2]); //99
    }
}
