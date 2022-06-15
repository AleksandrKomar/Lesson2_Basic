package hometasks.task4;



public class Main {
    public static void main(String[] args) {

        System.out.println(new Car().toString());
        System.out.println(new Car(2018).toString());
        System.out.println(new Car(2017, 220.15).toString());
        System.out.println(new Car(2019, 245.78, 1975).toString());
        System.out.println(new Car(2014, 255.88, 2975, "Black").toString());
    }
}
