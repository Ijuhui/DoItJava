package singletonExample;

public class CarFactory {
    private static CarFactory instances = new CarFactory();
    private CarFactory(){};
    public static CarFactory getInstance(){
        if(instances == null){
            instances = new CarFactory();
        }
        return instances;
    }

    public Car creatCar(){ //CarFactory에서 Car 인스턴스를 생성
        Car car = new Car();
        return car;
    }

}
