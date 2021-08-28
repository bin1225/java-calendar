package Calendar;

public class calendarMain {

    public static void main(String[] args) {

        Prompt cal = new Prompt();
        int month;
        int year;
        System.out.println("년도를 입력하세요.");
        System.out.print("YEAR> ");
        year = Scan.OneNum();
        System.out.println("달을 입력하세요.");
        System.out.print("MONTH> ");
        month = Scan.OneNum();

        cal.printSampleCalendar(year, month);

    }

}

