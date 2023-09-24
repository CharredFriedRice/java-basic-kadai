package kadai_020;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public void test(String word) {
		HashMap<String, String> hashFruits = new HashMap<String, String>();
		hashFruits.put("apple", "りんご");
		hashFruits.put("peach", "桃");
		hashFruits.put("banana", "バナナ");
		hashFruits.put("lemon", "レモン");
		hashFruits.put("pear", "梨");
		hashFruits.put("kiwi", "キウィ");
		hashFruits.put("strawberry", "いちご");
		hashFruits.put("grape", "ぶどう");
		hashFruits.put("muscat", "マスカット");
		hashFruits.put("cherry", "さくらんぼ");

		if (hashFruits.get(word) != null) {
			System.out.println(word + "の意味は" + hashFruits.get(word));
		} else {
			System.out.println("辞書に" + word + "は存在しません。");
		}
	}
}
