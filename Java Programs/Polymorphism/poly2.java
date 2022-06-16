public class poly2 {
    static String Animal(String a,String b)
    {
        String c=a+b;
        return c;
    }
    static int Animal(int a, int b,int c)
    {
        int d=a+b+c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println(poly2.Animal("cat","dog"));
        System.out.println(poly1.add(10,20,40));
    }
}
