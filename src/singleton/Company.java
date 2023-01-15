package singleton;

public class Company {
    private static Company instance = new Company(); //유일하게 생성하는 인스턴스. singletone 패턴(인스턴스를 단 하나만 생성)
    private Company(){}

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }
}
