import java.util.Scanner;

class euclid {

    static int Euclid1(int x, int y) {
        while(true){
         if(y == 0)
            return x;
         else{
             int t;
             t = x;
             x = y;
             y = t%y;
         }   
        }
    }
    static int Euclid2(int x, int y){
        if ( y == 0)
            return x;
        return Euclid2(x, x%y);

}   
 public static void main(String[] args){

        System.out.println("최대 공약수는 "+ Euclid1(12,8) + "입니다.");
  
        System.out.println("최대 공약수는 "+ Euclid2(221,143) + "입니다.");


    }
}
