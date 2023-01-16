package singletonExample;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.creatCar(); //creatCar 메소드를 통해 Car mySonata 인스턴스 생성
        Car yourSonata = factory.creatCar();
        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
