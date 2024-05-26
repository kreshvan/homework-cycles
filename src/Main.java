public class Main {
    public static void main(String[] args) {


        //задание 1
        int salary = 15000;
        int total = 0; //общий
        int month = 0; //месяц
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
        int finalfigure = 10;// конечная цифра
        while (number <=finalfigure ) {
            System.out.print(number);
            number = number + 1;
        }
        System.out.println(" ");
        for (number = finalfigure; number >= 1; number--) {
            System.out.print(number);
        }
        System.out.println(" ");//



//задание 3
        //peopleYear = рождаемость - смертность = 9 (С 1000чел)
        // за год с 12000000 (9 * 12000)
        int peopleYear = 0;
        int oneYear = 1;
        int summaPeople = 12000000; //количество населения
          int birthRate = 17;//смертность
        int mortality = 8;//рождаемость
        int yearFinish = 10;// за какое количество лет
        for (; oneYear <= yearFinish; oneYear++) {
            peopleYear+= ((birthRate- mortality) * summaPeople / 1000) ; //1000 - нужно ли ее определять в переменную?
            System.out.println("Год" + oneYear + "численность населения составляет" + peopleYear);
        }


        //задание 4
        int firstDepositAmount = 15000;// первая сумма вклада
        int general = 0;// общая сумма накоплений(вклад + проценты)
        int month2 = 0; //месяц
int finalSumma = 12000000; //конечная сумма накоплений
int contributionPercentage = 7;//проценты банка от накоплений
             for(; general<=finalSumma;month2++ ){
            general= general + general/100*contributionPercentage; // 100% (для вычесления 1%)
            general = general + firstDepositAmount;
            System.out.println("месяц" + month2+"сумма" +general);
        }



//задание 5
        int firstDepositAmount1 = 15000;// первая сумма вклада
        int general1 = 0;// общая сумма накоплений(вклад + проценты)
        int month3 = 0; //месяц
        int finalSumma1 = 12000000; //конечная сумма накоплений
        int contributionPercentage1 = 7;//проценты банка от накоплений
        for( ;general1<=finalSumma1;  ){

            month3 = month3+1;
            general1= general1 + firstDepositAmount1/100*contributionPercentage1;
            general1 = general1 + firstDepositAmount1;
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

