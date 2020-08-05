package linda;

import linda.Report;

public class Finance implements Report {
    @Override
    public void load(){
        System.out.println("Finance loading date");
    }

    @Override
    public void print() {
        System.out.println("Finance printing");
    }
}
