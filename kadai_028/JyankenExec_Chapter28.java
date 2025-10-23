package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        String myChoice = jyanken.getMyChoice();   // 自分の手を取得
        String opponentChoice = jyanken.getRandom(); // 相手の手を乱数で取得

        jyanken.playGame(myChoice, opponentChoice); // 勝負実行
    }
}
