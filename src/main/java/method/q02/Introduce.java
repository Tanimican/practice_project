package method.q02;

public class Introduce {

	public static void main(String[] args) {
		//名前 name を宣言
		String name = "山田";
		// 引数で渡された文字列を用いて自己紹介文を表示を出力
		selfIntroduce(name);
	}

	// 引数で渡された文字列を用いて自己紹介文を表示するメソッド
	public static void selfIntroduce(String name) {
		System.out.println(String.format("私の名前は%sです。", name));
	}

}