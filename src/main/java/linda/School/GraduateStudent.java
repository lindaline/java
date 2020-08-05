package linda.School;

public class GraduateStudent extends Student {
    int thesis;
    static int Pass = 70;

    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int average=getAverage();
        System.out.println(name + "\t" + english + "\t" + math + "\t" + thesis + "\t" + getAverage());
        if (getAverage() >= Pass) {
            System.out.println("\tPass");
        } else {
            System.out.println("\tFailed");
        }
        switch (getAverage() / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println(grading);
    }
}
