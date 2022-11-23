public class Cards {

    private String cards = "";
    public Cards () {
    }

    public String allCards() {
        for (int a=1;a<=4;a++) {
            for (int b=1;b<=13;b++) {
                if (a==1) {
                    cards+="D";
                }
                if (a==2) {
                    cards+="C";
                }
                if (a==3) {
                    cards+="H";
                }
                if (a==4) {
                    cards+="S";
                }
                if (b==13) {
                    cards+="K";
                }
                else if (b==12) {
                    cards+="Q";
                }
                else if (b==11) {
                    cards+="J";
                }
                else cards+="" + b;
            }
        }
        return cards;
    }
}
