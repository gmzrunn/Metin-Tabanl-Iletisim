public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Cat cat = new Cat();
        Cloud cloud = new Cloud();
        Cup cup = new Cup();
        Center center = new Center();

        center.kayit(car);
        center.kayit(cat);
        center.kayit(cloud);
        center.kayit(cup);
        center.showMap();

    }


}