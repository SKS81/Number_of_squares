package ru.netology.sqr;

public class SQRService {
    public int rezSQR(int min, int max) {
        int rez = 0;
        for (int a = 10; a <= 99; a++) {
            if (a * a >= min && a * a <= max) {
                rez++;
            }
        }
        return rez;
    }
}