package linda;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("hello");
        person p = new person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println("BMI = " + p.bmi());
    }
}
