public class Main {
    public static void main(String[] args) {


        //задание 1
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) { //пока-(While) - делай так(System.out)
            month = month + 1;
            total = salary + total;
            System.out.println("Месяц" + month + "сумма накоплений равна" + total + "рублей");
        }
//задание 1.1 для себя
        int salary1 = 15000;
        int month1 = 0;
        for (int total1 = 0; total1 <= 2459000; total1++) {
            total1 = total1 + salary1;
            month1 = month1 + 1;
            System.out.println("Месяц" + month1 + "сумма накоплений равна" + total1 + "рублей");
        }
        //задание 2
        int number = 1;
        while (number <= 10) {
            System.out.print(number);
            number = number + 1;
        }
        System.out.println(" ");
        for (number = 10; number >= 1; number--) {
            System.out.print(number);
        }
        System.out.println(" ");
//задание 3d
        //peopleYear = рождаемость - смертность = 9 (С 1000чел)
        // за год с 12000000 (9 * 12000)
        int PeopleYear = 0;
        int oneYear = 0;
        int summaPeople = 12000000;
        int quantityPeopleFromThousand = 9;
        for (oneYear = 1; oneYear <= 10; oneYear++) {
            // oneYear = oneYear+1;

            PeopleYear+= ( quantityPeopleFromThousand * summaPeople / 1000) ;
            System.out.println("Год" + oneYear + "численность населения составляет" + PeopleYear);
        }
        //задание 4
        int summaOne = 15000;
        int general = 0;
        int month2 = 0;
        for(; general<=12000000; ){

            month2 = month2+1;
            general= general + general/100*7;
            general = general + summaOne;
            System.out.println("месяц" + month2+"сумма" +general);
        }
//задание 5
        int summaOne1 = 15000;
        int general1 = 0;
        int month3 = 0;
        for( ;general1<=12000000;  ){

            month3 = month3+1;
            general1= general1 + summaOne1/100*7;
            general1 = general1 + summaOne1;
            if(month3%6==0)
                System.out.println("месяц" + month3+"сумма" +general1);
        }
        //задание 6
        int summaOne2 = 15000;
        int general2 = 0;
        // 9лет это 108есяцев
        for( int month4 = 0;month4 <=108 ; month4++  ){
            general2 = general2 + general2/100*7;
            general2 = general2 + summaOne2;
            //пол года это 6 месяцев
            if(month4%6==0)
                System.out.println(general2);
        }

//задание 7

        for(int friday = 5; friday<=31;){

            friday= friday+7;

            System.out.println("сегодня пятница"+friday + "число" );
        }



}
}

