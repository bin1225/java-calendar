package Calendar;

public class Prompt {
    private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int year,int month) {
        if(year%4==0&&(year%100!=0||year%400==0))
            maxDays[1]=29;
        return maxDays[month - 1];
    }
    public void printSampleCalendar(int year,int month) {

        int days = getMaxDaysOfMonth(year,month);
        System.out.printf(" <<%4d년%3d월>>\n", year,month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        int space = getWeekDayIndex(year,month)-1;

        for(int i= 0 ;i< space; i++){
            System.out.print("   ");
        }
        //for(int i = 1;i<7-space;i++)
        for(int i = 1; i <=7-space;i++)
        {
            System.out.printf("%3d",i);
        }
        System.out.println();
        space = space==7? 7:getWeekDayIndex(year,month)-1;
        for(int i = 7-space+1;i<=days;i++){
            System.out.printf("%3d",i);

            if(i%7==7-space)
                System.out.println();
        }

        }
    public int getWeekDayIndex(int year,int month){
        //Jen 1  /week day by year 2000 1 1 =sat
        int temp=0;
        for(int i = 2000;i<year;i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
                temp += 2;
            else
                temp++;
        }

        int n=0;
        for(int i = 1;i<month;i++)
        {
            temp += getMaxDaysOfMonth(year,i)%7;
        }

        return temp%7;
    }

}
