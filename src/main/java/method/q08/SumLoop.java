package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		// 最小値 minimum, 最大値maximum を宣言
		int minimum = 1;
		int maximum = 100;

		//最小値から最大値までの整数値を加算、結果を出力
		System.out.println(String.format("最小値:%d%n最大値:%d%n加算結果:%d", minimum, maximum, sumLoop(minimum, maximum)));
	}

	//最小値から最大値までの整数を加算し、結果を返すメソッド
	public static int sumLoop(int minimum, int maximum) {
		int sum = 0;
		for (int i = minimum; i <= maximum; i++) {
			sum += i;
		}
		return sum;
	}

}
