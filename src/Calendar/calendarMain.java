package Calendar;

import java.util.Scanner;

public class calendarMain {

    public static void main(String[] args) {

        UI.printHelp();
        Scanner scanner = new Scanner(System.in);
        String s;

        label:
        while(true){
            s = scanner.nextLine();
            switch (s) {
                case "q":
                    System.out.println("일정 프로그램을 종료합니다.");
                    break label;
                case "h":
                    UI.printHelp();
                    break;
                case "1":
                    UI.scheduleEnroll();
                    break;
                case "2":
                    UI.scheduleSearch();
                    break;
                case "3":
                    UI.printCalendar();
                    break;
            }

        }


    }

}

