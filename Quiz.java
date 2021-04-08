import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Quiz {
    public static void main(String[] args) throws IOException {
        PrintWriter od = new PrintWriter("c:/odd.txt");
        for(int i=1; i<100; i++) {
            if(i % 2 == 1)
            od.println(i);
        }
        od.close();

    }
}
