package Q7;

import Q6.Card;
public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance(); //company 참조변수에 CardCompany 싱클톤 패턴 인스턴스 주소 저장
        Card hana = company.creatCard("하나 카드");
        Card sinhan = company.creatCard("신한 카드");
        System.out.println(hana.getCardName() + "카드의 고유 번호는 " + hana.getCardNum() + "입니다."); //1001
        System.out.println(sinhan.getCardName() + "카드의 고유 번호는 " + sinhan.getCardNum() + "입니다."); //1002
    }
}
