package linda;

public class Health implements Report {
    @Override
    public void load(){
        System.out.println("Health loading date");
    }

    @Override
    public void print() {
        System.out.println("Health printing");
    }
}
