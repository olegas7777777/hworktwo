package ry.skyeng;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        byte apple = 127;
        System.out.println(apple);

    short orange = 12443;
        System.out.println(orange);

        int egg = 123344432;
        System.out.println(egg);

        long pen = 1343464564;
        System.out.println(pen + egg + orange + apple);

        float egg3 = 5.55f;
        System.out.println(egg3 );
        double egg2 = 5.055d;
        var box = egg2;
        System.out.println(box);


        int grammsInKilo=1000;
        int banana=5;
        float oneBanana=80;
        int milk=105;
        float oneMilk=200/100;
        int iceCreamSundae=2;
        float oneIceCreamSundae=100;
        int rawEggs=4;
        float oneRawEggs=70;
        float totalBlender= 5*oneBanana+105*oneMilk+2*oneIceCreamSundae+4* oneRawEggs;

        float resultInKilo=totalBlender/(grammsInKilo*1.0f);
        System.out.println("вес спорт завтрака"+resultInKilo+"кг");
//3 задача
        float grammeInKilo=1000f;
        int fatAthlete=7;
        float weightLossDifference=250f;
        float secondWeightLossDifference=500f;
        float slimmingTime=7*grammeInKilo/weightLossDifference;
        float secondslimmingTime=7*grammeInKilo/secondWeightLossDifference;
        float Diferent= slimmingTime/secondslimmingTime;
        float avgDay = (slimmingTime+secondslimmingTime)/2;
        System.out.println( "Дней необходимо"+slimmingTime);
        System.out.println("Дней необходимо"+secondslimmingTime);
        System.out.println("Разница "+avgDay);
// 5 задача
        int salaryMary=67760;
        int salaryDen=83690;
        int salaryKrys=76230;
        int precent=10;
        float newCoefficientSalary=  1+(precent/100f);

        int salaryNewMary=(int) (salaryMary*newCoefficientSalary);
        int salaryTotalMary=(salaryNewMary-salaryMary)*12;

        int salaryNewDen= (int) (salaryDen*newCoefficientSalary);
        int salaryTotalDen=(salaryNewDen-salaryDen)*12;

        int salaryNewKrys= (int) (salaryKrys*newCoefficientSalary);
        int salaryTotalKrys=  (salaryNewKrys-salaryKrys)*12;

        System.out.println("Маша теперь получает" +salaryNewMary+  "рублей"+"Годовой доход вырос на"+ salaryTotalMary+"рублей");
        System.out.println("Маша теперь получает" +salaryNewDen +   "рублей"+"Годовой доход вырос на"+ salaryTotalDen+"рублей");
        System.out.println("Маша теперь получает" +salaryNewKrys+  "рублей"+"Годовой доход вырос на"+ salaryTotalKrys+"рублей");
}
}