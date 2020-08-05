package linda;

public class person {
    String name;
    float weight;
    float height;

    public person(float weight,float height){
        this.weight=weight;
        this.height=height;
    }

    public person(String name,float weight,float height){
        this(weight, height);
        this.name=name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("hello");
    }
}
