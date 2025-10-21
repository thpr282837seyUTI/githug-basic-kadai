package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // 辞書クラスのインスタンス生成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語の配列
        String[] words = {"apple", "banana", "grape", "orange"};

        // 各英単語を調べる
        for (String word : words) {
            String meaning = dictionary.searchWord(word);
            
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
