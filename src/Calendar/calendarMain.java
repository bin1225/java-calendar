package Calendar;

import java.util.Scanner;

public class calendarMain {

    public static void main(String[] args) {

        System.out.println("+--------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+--------------------+");
        System.out.println("명령 (1, 2, 3, h, q)");
        Scanner scanner = new Scanner(System.in);
        String s;
        int n;
        while(true){
            s = scanner.nextLine();
            if(s.equals("q")) {
                System.out.println("일정 프로그램을 종료합니다.");
                break;
            }
            n= Integer.parseInt(s);
            if(n==1)
                UI.scheduleEnroll();
            else if(n==2)
                UI.scheduleSearch();
            else if(n==3)
                UI.printCalendar();

        }


    }

}

