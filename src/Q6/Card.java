package Q6;

public class Card {
    static int serialNum = 1000;
    int cardNum;
    String cardName;
    public Card(String cardName){
        serialNum++;
        this.cardNum = serialNum;
        this.cardName = cardName;
    }
    public static int getSerialNum(){
        return serialNum;
    }
    public static void setSerialNum(int serialNum){
        Card.serialNum = serialNum;
    }
    public int getCardNum(){
        return cardNum;
    }
    public String getCardName(){
        return cardName;
    }
}
