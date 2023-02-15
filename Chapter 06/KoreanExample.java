public class KoreanExample {
    public static void main(String[] args)
    {
        Korea k1 = new Korea("박자바","111111-2222222");

        System.out.println("k1.nation:"+k1.nation);
        System.out.println("k1.name:"+k1.name);
        System.out.println("k1:ssn"+k1.ssn);
        System.out.println();

        Korea k2 = new Korea("김자바","333333-4444444");

        System.out.println("k2.nation:"+k2.nation);
        System.out.println("k2.name:"+k2.name);
        System.out.println("k2.ssn:"+k2.ssn);
    }
}
