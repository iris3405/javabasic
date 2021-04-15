import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
    //     System.out.print("첫 자바 프로그램입니다.");
    //     System.out.print("화면에 출력하고 있습니다.");
    // }
    // 2가지 방법
    // System.out.println("홍");
    // System.out.println("길");
    // System.out.println("동");
    // System.out.print("홍\n길\n동");
    // System.out.println("홍");
    // System.out.println(" ");
    // System.out.println("길");
    // System.out.println("동");
    // System.out.print("홍\n\n길\n동");
   
    //합과 차를 구하는 다양한 방법
    // 앞이 문자면 뒤도 문자로 인식
    // System.out.println("82 + 17 = " + (82 + 17));
    // System.out.println("82 - 17 = " + (82 - 17));
    // double x = 63.4;
    // double y = 18.3;
    // System.out.println("x값은 " + x + " 입니다.");
    // System.out.println("y값은 " + y + " 입니다.");
    // System.out.println("합계는 " + (x + y) + " 입니다.");
    // System.out.println("평균은 " + (x + y)/2 + " 입니다.");

    // int x = 63;
    // int y = 18;
    // int z = 52;
    // int sum = x+y+z;
    // System.out.println("x값은 " + x + " 입니다.");
    // System.out.println("y값은 " + y + " 입니다.");
    // System.out.println("y값은 " + z + " 입니다.");

    // System.out.println("합계는 " + sum + " 입니다.");
    // System.out.println("평균은 " + sum/3 + " 입니다.");
    
    //****반드시 외우기 입력 스캐너 ****
    // import java.util.Scanner;

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수값: " );
    // int x = sc.nextInt();
    // System.out.println( x + "를 입력했습니다.");

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수값: ");
    // int x = sc.nextInt();
    // System.out.println("10을 더한 값은 " + (10 + x) + " 입니다.");
    // System.out.println("10을 뺀 값은 " + (x - 10) + " 입니다."); 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수값: ");
    // int x = sc.nextInt();
    // System.out.println("마지막 자릿수를 제외한 값은 " + (x/10) + "입니다.");
    // System.out.println("마지막 자릿수는 " + (x % 10) + "입니다."); 

    // Random rand = new Random();

    // int x = 1 + rand.nextInt(9);  //9미만 = 8 + 1 =9
    // int y = -1 - rand.nextInt(9); // - -
    // int z = 10 + rand.nextInt(90);

    // System.out.print("3개의 난수를 생성 했습니다. ");
    // System.out.println("한 자리 양의 정수 " + x);
    // System.out.println("한자리 음의 정수 " + y);
    // System.out.println("두자리 양의 정수 " + z);
    
    // # 2-12
    // Scanner sc = new Scanner(System.in);

    // Random rand = new Random();

    // System.out.print("정수값: ");
    // int x = sc.nextInt();

    // System.out.println("입력값의 5의 범위의 난수를 생성했습니다.");
    // System.out.println("값은 " + (x-5 + rand.nextInt(11)) + "입니다.");

    // Scanner sc = new Scanner(System.in);
    // System.out.print("성 : ");
    // String x =  sc.next();
    // System.out.print("이름 : ");
    // String y = sc.next();

    // System.out.println("안녕하세요. " + x + y + "씨");

    // # 2-16
    // String s1 = "ABC";
    // String s2 = "XYZ";

    // System.out.println("문자열 s1은" + s1 + "입니다.");
    // System.out.println("문자열 s2은" + s2 + "입니다.");

    // s1 = "FBI";
    
    // System.out.println("문자열 s1은" + s1 + "입니다.");
    // System.out.println("문자열 s2은" + s2 + "입니다.");

    // # 3-1

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수값 : ");
    // int n = sc.nextInt();

    // if (n < 0) {
    //     System.out.println("이 값은 음의 값입니다. ");

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수값 : ");
    // int n = sc.nextInt();

    // if (n < 0) {
    //     System.out.println("절대값은 " + (-n) + "입니다.");
    // }else{
    //     System.out.println("절대값은 " + n + "입니다.");
    // }

    // # 3-3
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("변수 A : ");
    // int x = sc.nextInt();
    // System.out.print("변수 B : ");
    // int y = sc.nextInt();

    // if (!(x % y == 0)) {
    //     System.out.println("B는 A의 약수입니다.");
    // }else{
    //     System.out.println("B는 A의 약수가 아닙니다.");
    // }

 // # 3-5

//  Scanner sc = new Scanner(System.in);

//     System.out.print("정숫값 : ");
//     int x = sc.nextInt();

//     if ( x > 0) {
//         System.out.println("값이 약수입니다.");
//     }else if(x == 0){
//         System.out.println("값이 0 입니다.");
//     }else{
//         System.out.println("값이 음수 입니다.");
    
//  Scanner sc = new Scanner(System.in);

//     System.out.print("정수값 : ");
//     int a = sc.nextInt();
//     System.out.print("정수값 : ");
//     int b = sc.nextInt();


//     if ( a > b) {
//         System.out.println("a가 크다");
//     }else if(a < b){
//         System.out.println("b가 크다");
//     }else{
//         System.out.println("a와 b가 같다");
//     }

// Scanner sc = new Scanner(System.in);

//     System.out.print("정수값 : ");
//     int a = sc.nextInt();
    
//     if ( a < 0 ) {
//     System.out.println("음의 정수값을 입력 했습니다.");
//     }else if(a % 10 == 0){
//     System.out.println("이 값은 10의 배수입니다.");
//     }else{
//     System.out.println("이 값은 10의 배수가 아닙니다.");
//     }

    //# 3-11
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("점수 : ");
    // int a = sc.nextInt();
    
    // if ( a > 100 ) {
    // System.out.println("잘못된 점수 입니다.");
    // }else if(a >= 90){
    // System.out.println("수 ");
    // }else if(a >= 70){
    // System.out.println("우 ");
    // }else if(a >= 50){
    // System.out.println("미 ");
    // }else if(a >= 30){
    // System.out.println("양 ");
    // }else{
    // System.out.println("가 ");
    // }

    // # 3-13

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수 a : ");
    // int a = sc.nextInt();
    // System.out.print("정수 b : ");
    // int b = sc.nextInt();

    // if (a > b) {
    //     System.out.println("두 값의 차는 " + (a-b) + "입니다.");
    // }else{
    //     System.out.println("두값의 차는 " + (b-a) + "입니다.");
    // }
// if 안쓰고 if

    // Scanner sc = new Scanner(System.in);

    // System.out.print("정수 a : ");
    // int a = sc.nextInt();
    // System.out.print("정수 b : ");
    // int b = sc.nextInt();

    // //삼항 연산자******
       
    // System.out.println((a>b) ? "두 값의 차는 " + (a-b) + "입니다." : 
    // (b>a)? "두값의 차는 " + (b-a) + "입니다." : "a와 b는 같다.");

    // #3-15
    // Scanner sc = new Scanner(System.in);
    
    // int mid =0;

    // System.out.print("정수 a : ");
    // int a = sc.nextInt();
    // System.out.print("정수 b : ");
    // int b = sc.nextInt();
    // System.out.print("정수 c : ");
    // int c = sc.nextInt();

    // if ((b > a && c < a) || (b < a && c > a))
    //     mid = a; // b > a > c
    // else if ((a>b && c < b) || (a<b && c>b))
    //     mid = b;
    // else
    //     mid = c;
    
    
    //System.out.println("중앙값은 " + mid + "입니다.");

    //#3-18
    // Scanner sc = new Scanner(System.in);
    


    // System.out.print("정수 a : ");
    // int a = sc.nextInt();
    // System.out.print("정수 b : ");
    // int b = sc.nextInt();

    // System.out.println("a>=b가 되도록 정렬했습니다." );
    // if ( a < b ){
    //     int t = a;
    //     a = b;
    //     b = t;
    // }
    // System.out.println("변수a는" + a + "입니다.");
    // System.out.println("변수b는" + b + "입니다.");

    //# 3-19

    Scanner sc = new Scanner(System.in);
    


    System.out.print("정수 a : ");
    int a = sc.nextInt();
    System.out.print("정수 b : ");
    int b = sc.nextInt();
    System.out.print("정수 c : ");
    int c = sc.nextInt();

    System.out.println("a<=b<=c가 되도록 정렬했습니다." );
    if ( a > b ){
        int t = a; a = b; b =t;
    }
    if (b > c){
        int t = b; b = c; c = t;
    }
    if (a > b){
        int t = a; a = b; b = t;
    }
    System.out.println("변수a는" + a + "입니다.");
    System.out.println("변수b는" + b + "입니다.");
    System.out.println("변수c는" + c + "입니다.");
}
}

