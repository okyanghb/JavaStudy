import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Random random = new Random() ;
        int i = random.nextInt(100) + 1;

        while (true) {
            System.out.println("请输入数字...");
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();

            if (guessNum > i) {
                System.out.println(" 大了");
            } else if (guessNum < i) {
                System.out.println("小了");
            } else {
                System.out.println("congratulations!");
                break;
            }
        }
    }
}
