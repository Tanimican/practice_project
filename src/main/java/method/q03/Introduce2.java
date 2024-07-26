package method.q03;

public class Introduce2 {

	public static void main(String[] args) {
		//名前 name,年齢 ageを宣言
		String name = "山田";
		int age = 25;

		// 引数で渡された文字列を用いて自己紹介文を表示を出力
		selfIntroduce(name, age);
	}

	// 引数で渡された文字列を用いて自己紹介文を表示するメソッド
	public static void selfIntroduce(String name, int age) {
		System.out.println(String.format("私の名前は%sです。年齢は%d歳です。", name, age));
	}

}
