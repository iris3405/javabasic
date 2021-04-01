public class ifexam {
    public static void main(String[] args){
    
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c));    
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a.equals(d)); 
        System.out.println(a);
        System.out.println(d);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

    }
}
