import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("\nЗадание 1");
        int i=0;
        while (i<=9){
            i++;
            System.out.print(i);
        }
        System.out.print("\n");

        for (;i>=1;){
            System.out.print(i);
            i--;
        }

        // Задание 2
        System.out.println("\nЗадание 2");
        int friday=5;
        for (int currentFriday=friday; currentFriday <= 31; currentFriday +=7) {
            System.out.println("Сегодня пятница, "+currentFriday+"-е число. Необходимо подготовить отчет.");
        }


        // Задание 3
        System.out.println("\nЗадание 3");
        int currentYear= LocalDate.now().getYear(); // выдаёт текущий год (2022)

        int start=currentYear - 200;
        int end=currentYear + 100;

        for (int year=start; year<=end; year++) {
            if (year%79==0){
                System.out.println(year);
            }
        }


        // Задание 4
        System.out.println("\nЗадание 4");
        int numbers;
        for (numbers=1; numbers<=30; numbers++) {
            System.out.print(numbers+ ": ");
            if (numbers%3==0 && numbers%5==0){
                System.out.println("ping pong");
            } else if (numbers%3==0){
                System.out.println("ping");
            } else if (numbers%5==0){
                System.out.println("pong");
            } else {
                System.out.println();
            }



        }


        // Задание 5
        System.out.println("\nЗадание 5");
        int a=0;
        int b=1;
        int c;
        for (; a<50; ) {
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}