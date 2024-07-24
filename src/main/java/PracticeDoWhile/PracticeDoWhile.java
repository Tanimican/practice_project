package PracticeDoWhile;

public class PracticeDoWhile {

	public static void main(String[] args) {
		// 100 から 1 ずつ減算して、0 まで表示するプログラムを作成
		int num = 100;
		do {
			System.out.println(num);
			num--;
		} while (num >= 0);
	}
}
