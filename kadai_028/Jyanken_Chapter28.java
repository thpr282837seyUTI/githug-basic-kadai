package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 🧍自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String myChoice = scanner.nextLine().toLowerCase(); // 小文字で受け取る
        return myChoice;
    }

    // 🎲 対戦相手の手を乱数で選ぶメソッド
    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        Random rand = new Random();
        int index = rand.nextInt(3); // 0～2
        return choices[index];
    }

    // ⚔️ じゃんけんを行うメソッド
    public void playGame(String myChoice, String enemyChoice) {

        // HashMapで手を対応づけ
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 入力値が正しいか確認
        if (!handMap.containsKey(myChoice)) {
            System.out.println("入力が正しくありません。r, s, p のいずれかを入力してください。");
            return;
        }

        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(enemyChoice));

        // 勝敗判定
        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && enemyChoice.equals("s")) ||
            (myChoice.equals("s") && enemyChoice.equals("p")) ||
            (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
