package ru.netology.sqr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    //Параметризированные тесты с выносом вводных данных в отдельный файл
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/squares.csv")
    public void RezSquaresTests(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.rezSQR(min, max);
        assertEquals(expected, actual);
    }

//Параметризированные тесты, вводные данные внутри теста
//    @ParameterizedTest
//    @CsvSource({
//            "3,200,300",
//            "11,100,400",
//            "8,100,300",
//            "3,200,300"
//    })
//    public void RezSquaresTests(int expected, int min, int max) {
//        SQRService service = new SQRService();
//        int actual = service.rezSQR(min, max);
//        assertEquals(expected, actual);
//    }

//НеПараметризированные тесты
//    @Test
//    public void RezSquaresRightOne() {
//        SQRService service = new SQRService();
//        int expected = 3;
//        int actual = service.rezSQR(200, 300);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void RezSquaresRightTwo() {
//        SQRService service = new SQRService();
//        int expected = 11;
//        int actual = service.rezSQR(100, 400);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void RezSquaresWrongOne() {
//        SQRService service = new SQRService();
//        int expected = 8;
//        int actual = service.rezSQR(100, 300);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void RezSquaresWrongTwo() {
//        SQRService service = new SQRService();
//        int expected = 3;
//        int actual = service.rezSQR(200, 300);
//        assertEquals(expected, actual);
//    }

}