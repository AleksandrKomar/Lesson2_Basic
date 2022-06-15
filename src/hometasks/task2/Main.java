package hometasks.task2;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Car().toString());
        System.out.println(new Car(2018).toString());
        System.out.println(new Car("Red").toString());
        System.out.println(new Car(2015, "Green").toString());
    }
}
