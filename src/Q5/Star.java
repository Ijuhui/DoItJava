package Q5;

public class Star {
    String starName;
    int customer;
    int money;

    public Star(String starName){
        this.starName = starName;
    }
    public void go(int money){
        this.money += money;
        customer++;
    }
    public void showStarInfo(){
        System.out.println(starName + "지점의 매출은 " + money + "이며, 방문 고객 수는" + customer + "명 입니다.");
    }
}
