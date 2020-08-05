package linda.School;

public class Student {
    String ID;
    String name;
    int english;
    int math;
    static int Pass=60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        int max = 0;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }
        return max;
    }

    public int getAverage() {
        return (english + math) / 2;
    }
    char grading = 'F';
    public void print() {
        System.out.println(name + "\t" + english + "\t" + math + "\t" + getAverage());
        if (getAverage() >= Pass ) {
            System.out.println("\tPass");
        } else {
            System.out.println("\tFailed");
        }
        switch (getAverage() / 10) {
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';
        }
        System.out.println(grading);
    }
}
