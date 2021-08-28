public class testMain {
    public static void main(String [] args)
    {
        int year = 1;
        int month = 1;
        String index1 = "  ";
        int index2 = 1;
        int days = 30;
        System.out.printf(" <<%4d년%3d월>>\n", year,month);
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("------------------");
        System.out.print(index1);
        int i;
        for(i = 1; i<  7 - index2;i++)
        {
            System.out.printf("%d  ",i);
        }
        for(i=1;i<days-index2;i++) {
            System.out.printf("%d ", i + index2);
            if (i % 6 == 0)
                System.out.print("\n");
        }
    }
}
