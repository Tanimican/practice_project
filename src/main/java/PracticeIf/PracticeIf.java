package PracticeIf;

public class PracticeIf {

	public static void main(String[] args) {
		// 1 ～ 100 までの整数を表示するプログラムを作成して下さい。
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { //	3 と 5 両方の倍数の場合 FizzBuzz と表示して下さい。
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) { //　3 の倍数の場合 Fizz と表示して下さい。
				System.out.println("Fizz");
			} else if (i % 5 == 0) { //	5 の倍数の場合 Buzz と表示して下さい。
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}
	}
}
