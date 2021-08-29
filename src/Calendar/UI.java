package Calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class UI {

    public static HashMap<String,String> scheduleList = new HashMap<>();
    private static final String SAVE_FILE ="calendar.dat";


    public static void scheduleEnroll(){
        System.out.println("[ 일정 등록 ] 날짜를 입력하세요.");
        System.out.print("> ");
        String date = Scan.OneStr();
        System.out.println("일정을 입력하세요.");
        System.out.print("> ");
        String schedule = Scan.OneStr();
        String updateSchedule =scheduleList.get(date);
        updateSchedule+=schedule;
        scheduleList.put(date,updateSchedule+"\n");
        System.out.println("일정이 등록되었습니다.");

        File f = new File(SAVE_FILE);
        try {
            FileWriter fw = new FileWriter(f,true);
            fw.write(date+schedule+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

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

        cal.printSampleCalendar(year, month, scheduleList);

    }

    public static void printHelp(){
        System.out.println("+--------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+--------------------+");
        System.out.println("명령 (1, 2, 3, h, q)");
    }
}
