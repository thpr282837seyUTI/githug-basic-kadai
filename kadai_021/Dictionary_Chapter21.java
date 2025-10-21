package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 英単語と意味を管理する辞書
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書の初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<String, String>();
        
        // 辞書に英単語と意味を登録
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 英単語の意味を調べるメソッド
    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return null; // 存在しない場合はnullを返す
        }
    }
}
