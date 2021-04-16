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

    // Scanner sc = new Scanner(System.in);
    


    // System.out.print("정수 a : ");
    // int a = sc.nextInt();
    // System.out.print("정수 b : ");
    // int b = sc.nextInt();
    // System.out.print("정수 c : ");
    // int c = sc.nextInt();

    // System.out.println("a<=b<=c가 되도록 정렬했습니다." );
    // if ( a > b ){
    //     int t = a; a = b; b =t;
    // }
    // if (b > c){
    //     int t = b; b = c; c = t;
    // }
    // if (a > b){
    //     int t = a; a = b; b = t;
    // }
    // System.out.println("변수a는" + a + "입니다.");
    // System.out.println("변수b는" + b + "입니다.");
    // System.out.println("변수c는" + c + "입니다.");

    // # 4-1

//     Scanner sc = new Scanner(System.in);
//     int retry;

// do{
//     System.out.print("정숫값 : ");
//     int x = sc.nextInt();

//     if ( x > 0) {
//         System.out.println("값이 약수입니다.");
//     }else if(x == 0){
//         System.out.println("값이 0 입니다.");
//     }else{
//         System.out.println("값이 음수 입니다.");
    
//     }
//     System.out.print("다시 한번? 1-Yes / 0-No : ");
//     retry = sc.nextInt();
//     }while (retry==1);

    //# 4-2

//     Scanner sc = new Scanner(System.in);

//     int n;

// do{
//     System.out.print("세 자리의 정수값 : ");
//     n = sc.nextInt();

//     }while(n < 100 || n > 999);

//     System.out.print("입력한 값은 " + n + "입니다.");
// # 4-3
//     Random rand = new Random();
//     Scanner sc = new Scanner(System.in);

//     int no = 10 + rand.nextInt(90); //정답생성
//     System.out.print("숫자 맞추기 게임 시작 ! ");
//     System.out.print("10부터 99사이의 숫자를 맞추세요. ");
//     int x;
// do{
//     System.out.print("어떤 숫자일까? : ");
//     x = sc.nextInt();

//     if(x > no){
//         System.out.print("더 작은 숫자입니다.");
//     }else if(x < no){
//         System.out.print("더 큰 숫자입니다.");
//     }
//    }while(x != no);

//     System.out.print("정답입니다.");

    //# 4-4
//    Scanner sc = new Scanner(System.in);
    
    

//     System.out.print("정수 A : ");
//     int a = sc.nextInt();
//     System.out.print("정수 B : ");
//     int b = sc.nextInt();
    
//     // 필요시 작은수 에서 큰수로 변경
//     if (a > b){
//         int t = a;
//         a = b;
//         b = t;
//     }
//     // a와b 사이의 정수 출력
//    do{
//     System.out.print(a + " ");
//     a += 1;
//     } while (a<=b);

// #4-5
// Scanner sc = new Scanner(System.in);

// System.out.println("카운트다운 합니다.");
// int a;
// do{
// System.out.print("양의 정수값 :");
// a = sc.nextInt();

// } while (a <= 0);

// while(a >= 0)
//     System.out.println(--a);


    
// System.out.println("x의 값이 "+a+"이 됐습니다.");
    
//# 4-7
// Scanner sc = new Scanner(System.in);

// System.out.print("몇개의 *를 표시할까요?:");
// int a = sc.nextInt();
// int i = 0;

// while (i<a){
//     if(i % 2 ==0)
//     System.out.print('*');
//     else
//     System.out.print('+');
//     i++;
// } 
//     System.out.println();
// # 4-8
// Scanner sc = new Scanner(System.in);

// System.out.print("양의 정수값의 자릿수를 표시합니다. ");
// System.out.print("양의 정수값");
// int a = sc.nextInt();
// int i = 0;

// while (a<0){
//     i++;
//     a = a/10; 
// } 
//     System.out.println("입력한 숫자는 "+i+"입니다. ");

//#4-9
// Scanner sc = new Scanner(System.in);

// System.out.print("양의 정수값 : ");
// int x = sc.nextInt();
// int y = 1;
// int i = 1;

// while (i <= x){
//     y = y * i;
//     i++;
// } 
//     System.out.println("1부터 "+ x +"까지의 곱은"+ y + "입니다.");

//#4-11
// Scanner sc = new Scanner(System.in);

// System.out.print("몇개의 *를 표시할까요?:");
// int x = sc.nextInt();

// for ( int i = 0; i < x; i++){
//     System.out.print("*");
// }
// if (x>=1) 
//     System.out.println();

//4-14
// Scanner sc = new Scanner(System.in);

// System.out.print("1부터 n까지의 합을 구합니다.n의 값 : ");
// int x = sc.nextInt();
// int sum = 0;

// for(int i = 1; i <= x; i++){
//     sum = sum + i;
// }

//  System.out.println("1부터 "+ x +"까지의 합은"+ sum + "입니다.");

//4-14

//  Scanner sc = new Scanner(System.in);

// System.out.print("1부터 n까지의 합을 구합니다.n의 값 : ");
// int x = sc.nextInt();
// int sum = 0;

// for(int i = 1; i < x; i++){
//     sum = sum + i;
//     System.out.println( i+"+");
// }

// //  System.out.println( x +"="+ (sum +x));

// //4-16
// Scanner sc = new Scanner(System.in);

// System.out.print("몇 cm부터 : ");
// int a = sc.nextInt();
// System.out.print("몇 cm까지 : ");
// int b = sc.nextInt();
// System.out.print("몇 cm단위 : ");
// int c = sc.nextInt();


// System.out.println("신장 표준체중");
// System.out.println("-------------");

// for(int i = a; i <= b; i=i+c){
//     System.out.println(i + " " + (i-100) * 0.9);
// }
//4-18
//***중요****
// Scanner sc = new Scanner(System.in);

// System.out.print("정수값 : ");
// int a = sc.nextInt();
// int c = 0;

// for ( int i = 1; i <= a; i++){
//     if(a % i == 0){
//     System.out.print(i+ " ");
//     c++;
//     }
//     }
// System.out.println("\n의 약수는 " + c +"개입니다.");
// Scanner sc = new Scanner(System.in);

// System.out.print("정수값 : ");
// int a = sc.nextInt();


// for ( int i = 1; i <= a; i++){

// System.out.println(i+"의 제곱은" +i*i +"입니다.");

// }

//4-20
// Scanner sc = new Scanner(System.in);

// System.out.print("계절을 찾습니다. ");
// int a = 0;
// int b = 0;

// do{
    
// do{
//     System.out.print("몇 월입니까?: ");
//     a = sc.nextInt();
// }while(a < 1 || a >= 13);

// if(a >= 3 && a <= 5){
//     System.out.println("봄입니다.");
// }else if(a >= 6 && a <= 8){
//     System.out.println("여름입니다.");
// }else if(a <= 9 && a <= 11){
//    System.out.println("가을입니다.");
// }else{
//    System.out.println("겨울입니다.");
// }
// System.out.println("다시 하겠습니까? 1....Yes/0....No:");
// b = sc.nextInt();
// }while(b == 1);

//4-21
// Scanner sc = new Scanner(System.in);

// System.out.println("정방형을 표시합니다.");
// System.out.print("단수는: ");
// int a = sc.nextInt();

// for ( int i = 0; i < a; i++){
//     for(int j = 0; j < a; j++ ){
//     System.out.print("*");
// }
// System.out.println();
// }
//4-22
// Scanner sc = new Scanner(System.in);

// System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
// System.out.print("단수는: ");
// int a = sc.nextInt();

// for ( int i = 1; i <= a; i++){
//     for(int j = 1; j <= i; j++){
//     System.out.print("*");
// }
// System.out.println();
// }
//4-22 -2
// Scanner sc = new Scanner(System.in);

// System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
// System.out.print("단수는: ");
// int a = sc.nextInt();

// for ( int i = 1; i <= a; i++){
//     for(int j = a; j >= i; j--){
//     System.out.print("*");
// }
// System.out.println();
// }

//4-22-3
// Scanner sc = new Scanner(System.in);

// System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
// System.out.print("단수는: ");
// int a = sc.nextInt();

// for(int k = 1; k <= a; k++){   //줄바꿈
// for ( int i = 1; i <= k-1; i++){ // 빈칸
//     System.out.print(" ");
// }
// for ( int j = 1; j <= a-k+1; j++){ //별
//     System.out.print("*");
// }
// System.out.println();
// }

//4-23

Scanner sc = new Scanner(System.in);

System.out.println("피라미드를다.");
System.out.print("단수는?: ");
int a = sc.nextInt();

for(int k = 1; k <= a; k++){   //줄바꿈
for (int i = a-1; i >= k; i--){ // 빈칸
    System.out.print("#");
}
for (int j = 1; j <= 9; j+2){ //별
    System.out.print("*");
}
System.out.println();
}
// 빈칸 4 별 1
// 빈칸 3 별 3
// 빈칸 2 별 5
// 빈칸 1 별 6
// 빈칸 0 별 9
}
}






