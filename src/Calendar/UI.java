package Calendar;

import java.util.HashMap;

public class UI {

    public static HashMap<String,String> scheduleList = new HashMap<>();

    public static void scheduleEnroll(){
        System.out.println("[ 일정 등록 ] 날짜를 입력하세요.");
        System.out.print("> ");
        String date = Scan.OneStr();
        System.out.println("일정을 입력하세요.");
        System.out.print("> ");
        String schedule = Scan.OneStr();
        scheduleList.put(date,schedule);
        System.out.println("일정이 등록되었습니다.");

    }
    public static void scheduleSearch(){
        System.out.println("[ 일정 검색 ] 날짜를 입력하세요.");
        System.out.print("> ");
        String date = Scan.OneStr();

        System.out.println(scheduleList.getOrDefault(date, "일정이 없습니다."));
    }
    public static void printCalendar(){
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
