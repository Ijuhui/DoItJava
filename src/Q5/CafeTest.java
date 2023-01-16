package Q5;

public class CafeTest {
    public static void main(String[] args) {
        Person jh = new Person("이주희", 50000);
        Person pp = new Person("김컴소" , 10000);
        Star starDong = new Star("동두천 별다방"); //동두천 지점의 별다방 인스턴스 생성
        Kong kongDong = new Kong("동두천 콩다방"); // 동두천 지점의 콩다방 인스턴스 생성
        jh.goStar(starDong);
        jh.showInfo();
        jh.goKong(kongDong);
        jh.showInfo();
        pp.goKong(kongDong);
        pp.goKong(kongDong);
        pp.showInfo();
        kongDong.showKongInfo();
        starDong.showStarInfo();
    }
}
