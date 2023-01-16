package Q5;

public class Person {
    int money;
    String name;

    public Person(String name, int money){
        setMoney(money);
        setName(name);
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }

    public void goStar(Star star){ //별다방으로 가는 메소드
        star.go(4000);
        this.money -= 4000;
    }

    public void goKong(Kong kong){ //콩다방으로 가는 메소드
        kong.go(4500);
        this.money -= 4500;
    }

    public void showInfo(){
        System.out.println(name + "님의 남은 잔액은 " + money + "원 입니다.");
    }
}
