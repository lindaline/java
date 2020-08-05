package linda.School;

import java.util.Scanner;

public class SchoolRemeber {
    public static void main(String[] args) {
        //userinput();
        Student stu=new Student("linda",60,89);
        Student stu2=new Student("peter",80,30);
        Student stu3=new Student("danny",50,70);
        GraduateStudent gste=new GraduateStudent("denial",50,30,60);
        gste.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score:"+stu.highest());
    }

    private static void userinput() {
        System.out.print("Please enter student's name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("please enter student's english");
        int english = scanner.nextInt();
        System.out.print("please enter student's math");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.print(stu.highest());
    }
}
