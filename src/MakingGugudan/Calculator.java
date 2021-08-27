package MakingGugudan;

class Discriminator {

    public static int main(int number){

        while (true) {
            number = Input.number();
            if(number>9||number<1)
            {
                System.out.println("2~9 사이 수를 입력해주십시오.");
            }
            else
                break;
        }

        return number;
    }
}
