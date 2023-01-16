package Q6;

import java.awt.*;

public class CardTest {
    public static void main(String[] args) {
        Card sinHan = new Card("신한 카드");
        System.out.println(sinHan.getCardName() + "의 카드고유 번호는 " + sinHan.getCardNum() + "입니다.");
        System.out.println(Card.getSerialNum());
        Card haNa = new Card("하나 카드");
        System.out.println(Card.getSerialNum());
        System.out.println(haNa.getCardName() + "의 카드고유 번호는 " + haNa.getCardNum() + "입니다.");
    }}
