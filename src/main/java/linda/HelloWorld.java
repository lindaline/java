package linda;

public class HelloWorld {
    public static void main(String[] args) {
        String s="abcde";
        System.out.print(s.charAt(1));
        System.out.print(s.substring(4));
        System.out.print(" ");
        System.out.println("hello");
        person p = new person("danny",66.5f,1.7f);
        p.hello();
        p.weight=66.5f;
        p.height=1.7f;
        System.out.println("BMI = " + p.bmi());
        int x = 87;
        System.out.println(x >= 50);
        char c = 'A';
        System.out.println(c <= 50);
    }
}
