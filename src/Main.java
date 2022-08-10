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
        int friday=1;
        for (; friday<=31; friday++) {
            if (friday%7==0){
                System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
            }
        }


        // Задание 3
        System.out.println("\nЗадание 3");
        int period=100;
        for (int years=0; years<=2122; years+=79) {
            if (years>=1822){
                System.out.println(years);
            }
        }
    }
}