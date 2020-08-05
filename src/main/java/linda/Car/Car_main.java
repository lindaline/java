package linda.Car;

import java.time.LocalDateTime;

public class Car_main {
    public static void main(String[] args) {
        CarTime();
    }

    private static void CarTime() {
        LocalDateTime enter=LocalDateTime.of(2020,8,1,0,30,59);
        LocalDateTime leave=LocalDateTime.of(2020,8,30,5,25,0);
        Car car=new Car("aa-0001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours=(long)Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
    }
}
