package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        //Вычисления в SQRService
        int min = 200;
        int max = 300;
        SQRService service = new SQRService();
        System.out.println(service.rezSQR(min, max));

//Вычисления в Main
//        int min = 200;
//        int max = 300;
//        int rez = 0;
//        for (int a = 10; a <= 99; a++) {
//            if (a * a >= min && a * a <= max) {
//                rez++;
//            }
//        }
//        System.out.println(rez);

    }
}