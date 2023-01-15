package singletonExample;

public class CarFactory {
    private CarFactory instance = new CarFactory();
    private CarFactory(){};
}
