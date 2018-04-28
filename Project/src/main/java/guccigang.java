import java.util.Scanner;

public class guccigang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String val = in.next();
        while(!(val.equals("stop"))){
            for(int i = 0; i<10; i++) {
                System.out.println("Gucci Gang");
            }
            val = in.next();
        }
    }
}
