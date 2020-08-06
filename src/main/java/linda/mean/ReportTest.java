package linda.mean;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        Report finance = new Finance();
        Report health = new Health();
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
