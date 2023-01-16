package Q5;

public class Kong {
    String kongName;
    int customer;
    int money;

    public Kong(String kongName){
        this.kongName = kongName;
    }
    public void go(int money){
        this.money += money;
        customer++;
    }
    public void showKongInfo(){
        System.out.println(kongName + "지점의 매출은 " + money + "이며, 방문 고객 수는" + customer + "명 입니다.");
    }
}
