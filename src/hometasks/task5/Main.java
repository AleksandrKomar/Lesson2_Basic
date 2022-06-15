package hometasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите радиус круга - ");
        System.out.printf("Площадь круга = %.2f", new MyArea().areaOfCircle(new Scanner(System.in).nextDouble()));

    }
}
