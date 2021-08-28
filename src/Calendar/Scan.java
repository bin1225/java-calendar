package Calendar;

import java.util.Scanner;

class Scan{

    public static int OneNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String OneStr() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }
}
