public class FloatExpansion {
    public static void main(String[] args) {
        // float    有限 离散 含有误差 大约  接近但不等于
        // double
        // BigDecimal (able to solve this problem)

        float f = 0.1f;
        double d = 1.0/10;

        System.out.println(f==d);   // >> false
        System.out.println(f);
        System.out.println(d);

        System.out.println("=====================");

        float f1 = 1223476723254652364563254f;
        float f2 = f1 + 1;
        System.out.println(f1==f2);
    }





}
