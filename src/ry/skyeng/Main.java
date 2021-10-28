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

        long pen = 1343464564L;
        System.out.println(pen + egg + orange + apple);

        float egg3 = 5.55f;
        System.out.println(egg3 );
        double egg2 = 5.055;
        var box = egg2;
        System.out.println(box);
        char k= 35;
        char y= '#';
        System.out.println(k+"="+y);

         //2 задача
        float firstBoxer = 78.2f;
        float secondBoxer = 87.7f;
        float total = secondBoxer + firstBoxer;
        System.out.println("Общий вес боксеров "  + total);

          // 3 задача
        int grammsInKilo=1000;
        int banana=5;
        float weightBanana=80;
        int milk=105;
        float weightMilk=200/100;
        int iceCreamSundae=2;
        float weightIceCreamSundae=100;
        int rawEggs=4;
        float weightRawEggs=70;
        float totalBlender= banana*weightBanana+milk*weightMilk+iceCreamSundae*weightIceCreamSundae+rawEggs*weightRawEggs;

        float resultInKilo=totalBlender/(grammsInKilo*1.0f);
        System.out.println("вес спорт завтрака "+resultInKilo+"кг");
          //4 задача
        int grammeInKilo=1000;
        int fatAthlete=7;
        int weightLossDifference=250;
        int secondWeightLossDifference=500;
        int slimmingTime= fatAthlete*grammeInKilo/weightLossDifference;
        int secondslimmingTime=  fatAthlete*grammeInKilo/secondWeightLossDifference;
        int Diferent= slimmingTime/secondslimmingTime;
        int avgDay = (slimmingTime+secondslimmingTime)/2;
        System.out.println( "Дней необходимо "+slimmingTime);
        System.out.println("Дней необходимо "+secondslimmingTime);
        System.out.println("Дней в среднем  "+avgDay);
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

        System.out.println("Маша теперь получает " +salaryNewMary+  " рублей "+" Годовой доход вырос на " + salaryTotalMary+" рублей");
        System.out.println("Маша теперь получает " +salaryNewDen +   " рублей "+" Годовой доход вырос на " + salaryTotalDen+" рублей");
        System.out.println("Маша теперь получает " +salaryNewKrys+  " рублей "+" Годовой доход вырос на " + salaryTotalKrys+" рублей");
}
}