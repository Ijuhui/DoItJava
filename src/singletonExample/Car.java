package singletonExample;

public class Car {
    public static int serialNum = 10001;
    int carNum;
    String carName;

    public Car(){
        serialNum++;
        carNum = serialNum;
    }
    public void setCarName(String carName){
        this.carName = carName;
    }
    public String getCarName(){
        return carName;
    }
    public int getCarNum(){
        return carNum;
    }
}
