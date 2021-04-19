import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // int finger = 10;
        // System.out.printf("Finger=[%5d]\n", finger);
        // System.out.printf("Finger=[%-5d]\n", finger);
        // System.out.printf("Finger=[%15d]\n", finger);

        Scanner sc = new Scanner(System.in);
        
        System.out.print("두 자리 정수를 하나 입력해 주세요.> ");
 
        String input = sc.nextLine();

        int num = Integer.parseInt(input);

        System.out.println("입력내용:" + input);
        System.out.printf("num=%d%n",num);

    }

}