package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        String myChoice = jyanken.getMyChoice(); // 入力処理
        String enemyChoice = jyanken.getRandom(); // 乱数で手を決定
        jyanken.playGame(myChoice, enemyChoice); // 結果表示
    }
}
