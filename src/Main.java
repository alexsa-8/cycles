import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("\nЗадание 1");
        int i=0;
        while (i<=9){             // while (i<10) {
            i++;                  // не надо
            System.out.print(i);  //   System.out.print(++i + " ");
        }                         // }
        System.out.print("\n");   // System.out.println();

        for (;i>=1;){             // for (;i>0;i--){
            System.out.print(i);  //   System.out.print(i+ " ");
            i--;                  // не надо
        }                         // }

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
    }
}