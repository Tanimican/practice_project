package PracticeForEach;

public class PracticeForEach {

	public static void main(String[] args) {
		// 社員10名をまとめた配列またはコレクションを作成し社員名を出力
		String[] names = { "田原", "福尾", "倉成", "濱野", "前村", "重永", "谷口", "三浦", "吉田", "古野" };

		for (String name : names) {
			System.out.println(name);
		}
	}

}
