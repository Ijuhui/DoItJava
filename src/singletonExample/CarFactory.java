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
}
