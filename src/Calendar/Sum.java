package Calendar;

import java.util.Scanner;

public class Sum {
    public static int two()
    {
        Scanner scanner = new Scanner(System.in);

        int scanNum1 = scanner.nextInt();
        int scanNum2 = scanner.nextInt();
        scanner.close();
        return scanNum1+scanNum2;
    }
}
