import java.util.* ;

class Main{
    public static void main(String[] args) {
        
    //5-4
    // boolean b1 = true;
    // boolean b2 = false;

    // System.out.println("b1 ="+b1);
    // System.out.println("b2 ="+b2);

//5-5
    // Scanner sc = new Scanner(System.in);

    // System.out.print("x값:");
    // int x = sc.nextInt();
    // System.out.print("y값:");
    // int y = sc.nextInt();
    // System.out.print("z값:");
    // int z = sc.nextInt();

    // double avg = (x+y+z) / 3;

    // System.out.print("x,y,z,의 평균은 "+ avg +"입니다.");
    
//5-6
    // Scanner sc = new Scanner(System.in);

    // System.out.print("x값:");
    // int x = sc.nextInt();
    // System.out.print("y값:");
    // int y = sc.nextInt();
    // System.out.print("z값:");
    // int z = sc.nextInt();

    // double avg = (x+y+z) / 3.0;

    // System.out.print("x,y,z,의 평균은 "+ avg +"입니다.");

//5-7
    //  int a;
    // //a = 10.0; 에러
    // a = (int) 10.0;

    // System.out.println("a = "+ a);

//5-8
    
    // System.out.println("float         int");
    // System.out.println("-----------------");

    // float x = 0.0F;
    // for (int i = 0 ; i <= 1000; i++, x += 0.001F){
    //    System.out.printf("%10.7f %10.7f\n",x, (float)i/1000);
// 6-7
// Scanner sc = new Scanner(System.in);
// System.out.print("사람 수:");
// int n = sc.nextInt();
// System.out.println("점수를 입력하세요");
//   int[] a = new int[n];
//   int sum = 0;

//   for (int j = 0; j < n ; j++){
//     System.out.print(j + "번의 점수 :");
//     a[j]= sc.nextInt();
//     sum += a[j];
//   }

//   int max = a[0];
//   int min = a[0];
//   for (int i = 1 ; i <n ; i++) {
//     if (a[i] > max) max = a[i];
//     if (a[i] < min) min = a[i];       
//   }


// System.out.println("합계는 " + sum + "입니다");
// System.out.println("평균은 " + (double)sum / n + "입니다");
// System.out.println("최고점은 " + max + "입니다");
// System.out.println("최저점은 " + min + "입니다");

//6-12

// Random rand = new Random();
//     Scanner sc = new Scanner(System.in);
//     System.out.print("요소 수:");
//     int n = sc.nextInt();
//     int[] a = new int[n];

//       for (int j = 0; j < n ; j++){
//         a[j]= 1+ rand.nextInt(10);
//       }
      
//       for (int j = 0; j < n ; j++){
//           System.out.println("a["+j+"] = " + a[j]);
//       }

//6-13
// Random rand = new Random();
//     Scanner sc = new Scanner(System.in);

//     int n = 0;
//     do {
//       System.out.print("요소 수:");
//       n = sc.nextInt();
//     }while(n>10);

//     int[] a = new int[n];

//     //a[0]= 1+ rand.nextInt(10);

//       for (int i = 0; i < n ; i++){
//         int j;
//         do {
//           j = 0;
//           a[i] = 1+ rand.nextInt(10);
//             for (j = 0 ; j < i ; j++){
//               if (a[j] == a[i]) break;
//             }
//         } while(j < i);
//       }
//       for (int j = 0; j < n ; j++){
//           System.out.println("a["+j+"] = " + a[j]);
//       }

// 6-14
// Random rand = new Random();
//     Scanner sc = new Scanner(System.in);
//     System.out.print("요소 수:");
//     int n = sc.nextInt();
//     int[] a = new int[n];

//       for (int j = 0; j < n ; j++){
//         System.out.print("a["+j+"] = ");
//         a[j]= sc.nextInt();
//       }

//     System.out.println("요소를 섞었습니다.");

//       for (int i = 0 ; i < n ; i++) {
//         int x = rand.nextInt(n);
//         int y = rand.nextInt(n);
//         int t = a[x];
//         a[x] = a[y];
//         a[y] = t;
//       }

//       for (int j = 0; j < n ; j++){
//           System.out.println("a["+j+"] = " + a[j]);
//       }

    //   Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    // int[] a = new int[n];
    // int[] b = new int[n];
    //   for (int j = 0; j < n ; j++){
    //     System.out.print("a["+j+"] = ");
    //     a[j]= sc.nextInt();
    //   }

    //   for (int i = 0; i < n ; i++){
    //     b[i] = a[n-i-1]; 
    //   }

    //   for (int j = 0; j < n ; j++){
    //       System.out.println("b["+j+"] = " + b[j]);
    //   }

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    String months[] = {  
      "January", "February", "March", "April", 
      "May","June","July","August",
      "September","October","November","December"
  };
    int re = 0;

    System.out.println("해당 월의 영어 단어를 입력하시오");
    System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
    do{
    int month = 1 + rand.nextInt(12);
  
    while(true){
    System.out.print(month + "월:");
    String s = sc.next();

    if (s.equals(months[month-1])) break; 
      System.out.println("틀렸습니다.");
    }  
      System.out.print("정답입니다.");
      System.out.print("다시 한번? 1....Yes / 0....No: ");
      re =  sc.nextInt();
  
    }while(re == 1);

    }
}

