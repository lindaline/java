package linda;

public class person {
    String name;
    float weight;
    float height;

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("hello");
    }
}
