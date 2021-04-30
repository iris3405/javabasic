import java.util.*;

import org.w3c.dom.NameList;

public class Main {
    public static void main(String[] args){
    
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
    
        // String[] dayKor = {"일","월","화","수","목","금","토"};
        // String[] dayEng = {"sun","mon","tue","wed","thu","fri","sat"};
    
        // System.out.println("요일명을 영어 소문자로 입력하시오");
    
        // int last= -1; // 이전 요일
        // int retry = 0; 
        // do {
        //   int day;
        //   do {
        //     day = rand.nextInt(7);
        //   } while(day == last);
        //   last = day;
    
        //   while (true) {
        //     System.out.print(dayKor[day]+"요일 : ");
        //     String s = sc.next();
    
        //     if (s.equals(dayEng[day])) break;  //정답일경우
    
        //     System.out.println("틀렸습니다. ");
        //   }
        //   System.out.print("정답입니다. 다시 한번? 1...Yes/0...No :");
        //   retry = sc.nextInt();
        // }while(retry == 1);
    //6-18

//     Scanner sc = new Scanner(System.in);

//     int[][] a = new int[4][3];
//     int[][] b = new int[3][4];
//     int[][] c = new int[4][4];

//     System.out.println("행렬 a의 요소를 입력하세요");
//     for (int i = 0; i < 4;i++){
//       for (int j = 0; j < 3;j++) {
//         System.out.print("a["+i+"]["+j+"] :");
//         a[i][j] = sc.nextInt();
//       }
//     }

//     System.out.println("행렬 b의 요소를 입력하세요");
//     for (int i = 0; i < 3;i++){
//       for (int j = 0; j < 4;j++) {
//         System.out.print("b["+i+"]["+j+"] :");
//         b[i][j] = sc.nextInt();
//       }
//     }

//     for (int i = 0; i < 4;i++){
//       for (int j = 0; j < 4;j++) {
//         c[i][j] = 0;
//         for (int k = 0;k < 3; k++){
//           c[i][j] += a[i][k] * b[k][j];
//         }
//       }
//     }

//     System.out.println("행렬 a와 b의 곱");
//     for (int i = 0; i < 4;i++){
//       for (int j = 0; j < 4;j++) {
//         System.out.print(c[i][j]+ "  ");
//       }
//       System.out.println();
//     }

//     }
// }
// 6-19
// Scanner sc = new Scanner(System.in);

// System.out.println("6명의 국어, 수학 점수를 입력하세요");

// int[][] point = new int[6][2];
// int[] sumStudent = new int[6];
// int[] sumSubject = new int[2];

// for (int i = 0; i < 6; i++){
//   System.out.print(i+1+"번 국어:");
//   point[i][0] = sc.nextInt();
//   System.out.print("    수학:");
//   point[i][1] = sc.nextInt();

//   sumStudent[i] = point[i][0] + point[i][1];//학생점수
//   sumSubject[0] += point[i][0];   //국어점수합
//   sumSubject[1] += point[i][1];   //수학점수합

// }

//   System.out.println("No.\t국어\t수학\t평균");
//   for (int i = 0; i < 6; i++) {
//     System.out.print((i+1)+"\t"+point[i][0]+"\t\t"+point[i][1]+"\t\t"+(double)sumStudent[i]/2);
//     System.out.println();
//   }
//   System.out.println("평균 "+(double)sumSubject[0]/6+"\t"+(double)sumSubject[1]/6);
//     }
// }
//6-21
// Scanner sc = new Scanner(System.in);

// System.out.print("학급수 : ");
// int classNum = sc.nextInt();
// int[][] point = new int[classNum][];
// int totNumber = 0;

// for (int i = 0 ; i < point.length ; i ++){
//   System.out.print(i+1+"반의 학생수 : ");
//   int num = sc.nextInt();

//   point[i] = new int[num];
//   totNumber += num;

//   for (int j = 0; j < point[i].length; j++){
//     System.out.print((i+1) + "반"+ (j+1) +"번의 점수 :");
//     point[i][j] = sc.nextInt();
//   }
// }
//   System.out.println("  반 |   합계  평균");
//   System.out.println("----+-----------------");
//   int total = 0;
//   for (int i = 0 ; i < point.length; i++) {
//     int sum = 0;
//     for (int j = 0; j <point[i].length; j++) {
//       sum += point[i][j];
//     }
//     total += sum;
//     System.out.printf("%2d반 | %7d %7.1f\n",i+1,sum, (double)sum/point[i].length);
//   }    

//   System.out.println("----+-----------------");
//     System.out.printf("  합 | %7d %7.1f\n",total, (double)total/totNumber);
//     }
// }
//7-2

// Scanner sc = new Scanner(System.in);
// System.out.print("정수 x:");
// int x = sc.nextInt();

// int s = signOf(x);
// System.out.println("signOf(x)는"+s+"입니다");
// }  //main 닫기

// static int signOf(int n){
//   if (n > 0)
//     return 1;
//   else if (n < 0)
//     return -1;
//   else 
//     return 0;

//     Scanner sc = new Scanner(System.in);
// System.out.print("정수 x:");
// int x = sc.nextInt();

// int s = signOf(x);
// System.out.println("signOf(x)는"+s+"입니다");
// }  //main 닫기

// static int signOf(int n){
//   if (n > 0)
//     return 1;
//   else if (n < 0)
//     return -1;
//   else 
//     return 0;
// }
// }
//7-6
// Scanner sc = new Scanner(System.in);
// System.out.println("1부터 x까지의 합을 구하세요"); 
// System.out.print("x의 값:"); int x = sc.nextInt();
// System.out.print("1부터 "+x+"의 합은"+sumUp(x)+"입니다."); 

//   }

// static int sumUp(int n){
//   int sum = 0;
//   for (int i = 1; i <= n ; i ++)
//     sum+=i;
//   return sum;
//7-7
// Scanner sc = new Scanner(System.in);
// System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다. "); 
// System.out.print("단수는:"); int n = sc.nextInt();

// for (int i = 1;i <= n ; i++) {
//     putStart(i);
//     System.out.println();
//   }
// }// main 
  
// static void putStart(int n){
//   putChars('*',n);
// }

// static void putChars(char c, int n) {
//   while(n-- > 0)
//     System.out.print(c);
// }
//     static int random(int a, int b){
//       if (b <= a) {
//         return a;
//       }else{
//         Random rand = new Random();
//         return a + rand.nextInt(b-a+1);
//       }
  
// Scanner sc = new Scanner(System.in);
// int x;
// do{
//   int n = readPlusInt();

//   System.out.print("반대로 읽으면 ");
//   while(n>0){
//     System.out.print(n%10);
//     n = n / 10;
//   }
//   System.out.println("입니다");

//   do {
//     System.out.print("다시 한 번?<Yes...1/No...0>");
//     x=sc.nextInt();
//   }while (x!=0 && x!=1);
// }while(x==1);

// } // main  닫기

// static int readPlusInt() {
//   Scanner sc = new Scanner(System.in);
//   int x;
//   do {
//     System.out.print("양의 정수값:");
//     x = sc.nextInt();
//   } while(x <=0);
//   return x;

//7-10
  
// Scanner sc = new Scanner(System.in);
// Random rand = new Random();

// System.out.println("암산 훈련!!");

// do {

//   //난수 발생
//   int x = rand.nextInt(900) + 100;//3자리수
//   int y = rand.nextInt(900) + 100;
//   int z = rand.nextInt(900) + 100;
//   int p = rand.nextInt(4);        //문제 유형

//   int answer = 0;
//   switch (p){
//     case 0: answer = x + y + z; break;
//     case 1: answer = x + y - z; break;
//     case 2: answer = x - y + z; break;
//     case 3: answer = x - y - z; break;

// }while(true){
//   System.out.print(x + ((p<2) ? "+":"-")+y+((p%2==0) ? "+":"-")+z+"=");
//   int k = sc.nextInt();
//   if (k==answer)
//     break;
//   System.out.println("틀렸습니다.");
// }

// }while(retry());
//   } // main end

// static boolean retry() {
//   Scanner sc = new Scanner(System.in);
//   int cond;
//   do {
//     System.out.print("다시 한 번?<Yes...1/No...0> :");
//     cond = sc.nextInt();
//   }while (cond != 0 && cond != 1);
//   return cond == 1;
//7-19

// Scanner sc = new Scanner(System.in);

// System.out.println("요소수");
// int n = sc.nextInt();
// int[] a = new int[n];

// for (int i = 0; i <n; i++){
//   System.out.print("a["+i+"] : ");
//   a[i] = sc.nextInt();
// }

// System.out.print("삭제를 시작할 인덱스 : ");
// int d = sc.nextInt();
// System.out.print("삭제할 요소의 개수 : ");
// int e = sc.nextInt();

// aryRmv(a, d, e);

// // for (int i = 0; i < n; i++){
// //   System.out.println("a["+i+"] = "+a[i]);
// // } 

// // }//main 닫기

// // static void aryRmv(int[] a, int d, int e){
// //   if (e > 0 && d >= 0 && d+e < a.length){
// //     int d2 = d + e - 1;
// //     if (d2 > a.length - e - 1)
// //     d2 = a.length-e-1;
// //     for(int i = d; i <= d2; i++){
// //       a[i] = a[i+e];
// //     }
// //   }
// // class Humen{
// //   String name;
// //   int hright;
// //   int weight;

// class Period {
//   //변수
//   private Day from; //시작일
//   private Day to;   //종료일

//   // 생성자
//   public Period(Day form, Day to){
//     this.from = new Day(from);
//     this.to = new Day(to);
  
//   // 매서드
//   public Day getFrom() {return new Day(from);}
//   public Day getTo()   {return new Day(to);}

//   public String toString() {
//     return "{" + from + "~" + to + ")";
//   }
//   }


// class Main {
//   public static void main(String[] args){
//     Period taejo = new Period(new Day(1392,8,5), new Day(1398,10,14));

//     System.out.println("태조 = "+ taejo);
//   }

//   Scanner sc = new Scanner(System.in);

//   System.out.print("실수값:");
//   double x = sc.nextDouble();

//   System.out.println("절댓값:" + Math.abs(x));
//   System.out.println("제곱근:" + Math.sqrt(x));
//   System.out.println("면  적:" + Math.PI*x*x);

// }
// class Main {
  //2개중 최소값 찾기 매서드  (매서드 오버로딩)
//   public static int min(int a, int b) {
//     return a < b ? a : b;
//   }
//   public static int max(int a, int b) {
//    return a > b ? a : b;
//   }
//   public static int min(int a, int b, int c) {
//    int min = a;
//    if(b<a) min=b;
//    if(c<min) min=c;
//    return min;
//   }
//   public static int max(int a, int b, int c) {
//    int max = a;
//    if(b>max) max=b;
//    if(c>max) max=c;
//    return max;
//   }
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.print("x값:");int x = sc.nextInt();
//     System.out.print("y값:");int y = sc.nextInt();
//     System.out.print("z값:");int z = sc.nextInt();

//     System.out.print("x,y의 최소값은 "+ min(x,y+'입니다.');
//     System.out.print("x,y의 최소값은 "+ min(x,y+'입니다.');
//     System.out.print("x,y의 최소값은 "+ min(x,y+'입니다.');
//     System.out.print("x,y의 최소값은 "+ min(x,y+'입니다.');
//   }
    
// }
//13-1
// abstract class Animal{
//   String name;
//   public Animal(String name){
//     this.name = name;
//   }
//   public abstract void bark();

//   public String getName(){
//     return name;
//   }

// }
// class Dog extends Animal{
//   String type;
//   public Dog(String name, String type){
//     super(name);this.type = type;

//   }
//   public void bark(){
//     System.out.println("멍멍!");

//   }
// }
// class Cat extends Animal{
//   int age;
//   public Cat(String name, int age){
//     super(name);this.age = age;
//   }
//   public void bark(){
//     System.out.println("냐옹!");
//   }
// }
//   Animal [] a = new Animal[2];
//   a[0] =  new Dog("뭉치", "치와와");
//   a[1] = new Cat("마이클",7);

//   System.out.print(a[0].getName()+" ");
//   a[0].bark();
//   System.out.print(a[1].getName()+" ");
//   a[1].bark();

// abstract class Animal{
//   String name;
//   public Animal(String name){
//     this.name = name;
//   }
//   public abstract void bark();

//   public String getName(){
//     return name;
//   }

// }
// class Dog extends Animal{
//   String type;
//   public Dog(String name, String type){
//     super(name);this.type = type;

//   }
//   public void bark(){
//     System.out.println("멍멍!");

//   }
// }
// class Cat extends Animal{
//   int age;
//   public Cat(String name, int age){
//     super(name);this.age = age;
//   }
//   public void bark(){
//     System.out.println("냐옹!");
//   }
// }
//   Animal [] a = new Animal[2];
//   a[0] =  new Dog("뭉치", "치와와");
//   a[1] = new Cat("마이클",7);

//   System.out.print(a[0].getName()+" ");
//   a[0].bark();
//   System.out.print(a[1].getName()+" ");
//   a[1].bark();
// }
// }

// // 13-1

// abstract class Animal{
//   private String name;
//   public Animal(String name){
//   this.name = name;
//   }
//   public abstract void bark();

//   public String getName() {
//     return name;
//   }
//   public void introduce() {
//     System.out.print(toString()+"이다. ");
//     bark();

//   }
  
// }

// class Dog extends Animal{
//   private String type;  //개 종류
//   public Dog(String name, String type){ // 생성자
//     super(name);this.type = type;
//   }
//   public void bark() {
//     System.out.println("멍멍!");  //짖기
//   }
//   public String toString() {
//     return type + "의 "+getName();
//   }

// }

// class Cat extends Animal{
//   int age;                          // 고양이의 나이
//   public Cat(String name, int age){ // 생성자
//     super(name);this.age = age;
//   }
//     public void bark() {             //짖기
//     System.out.println("냐옹!");
//   }
//     public String toString() {
//     return age + "의 "+getName();
//   }


// }
// class Main{
// public static void main(String[] args){
//   // Animal x = new Animal(); // 추상 클래스는 인스턴스르 생성할 수 없다. 

//   Animal[] a = new Animal[2];
//   a[0] = new Dog("뭉치"

// //13-5 13- 6

// abstract class Player {
//   int hand; //손 (가위 바위 보)
// }

// // 사람 손
// class Human extends Player {
//   Scanner sc = new Scanner(System.in);

//   public int humanHand(){
//   do {
//     System.out.print("가위바위보!!!0...바위/1...가위/2...보");
//     hand = sc.nextInt();
//   }while(hand < 0 || hand > 2);
//   return hand;
//   }
// }

// // 컴퓨터 손

// class Computer extends Player {
//   Random rand = new Random();

//   public int ComputerHand() {
//     return rand.nextInt(3);
//   }
// }


//     Human hp = new Human();
//     Computer cp = new Computer();
//     String[] hands = {"가위","바위","보"};

//     int humanHand = hp.humanHand();
//     int computerHand = cp.ComputerHand();

//     System.out.println("나는 "+hands[humanHand]+"이고, 당신은"+hands[computerHand]+"입니다. ");
//     System.out.println(rkc(computerHand, humanHand));
//   }
// public static String rkc(int com, int per){
//   if((com - per == -1) || (com - per == 2))
//   return "당신이 졌습니다.";

//   else if(com - per == 0)
//   return "비겼습니다.";

//   else
//   return "당신이 이겼습니다.";
// }

// }

// Scanner sc = new Scanner(System.in);

// System.out.print("문자열:");
//   String s = sc.next();
//   System.out.print("반대로 읽으면 ");
//   for(int i = s.length()-1 ; i >= 0;i--){
//   System.out.print(s.charAt(i));
//   }
//   System.out.print("입니다. ");


    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 s1:");
    String s1 = sc.next();
    System.out.print("문자열 s2:");
    String s2 = sc.next();
  
    int idx = s1.indexOf(s2);
    if (idx==-1)
      System.out.println("s1안에 s2가 포함되어있지 않습니다. ");
    else{
          System.out.println(s1);
          System.out.println(idx);
  
  
    }
  
  }
  }


  

  