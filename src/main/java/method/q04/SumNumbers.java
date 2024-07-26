package method.q04;

public class SumNumbers {

	public static void main(String[] ages) {
		//整数 value1, value2 を宣言
		int value1 = 3;
		int value2 = 2;

		//引数で渡された整数を加算し、結果を出力
		System.out.println(String.format("第一引数:%d%n第二引数:%d%n加算結果:%d", value1, value2, calculateSum(value1, value2)));
	}

	//引数で渡された整数を加算し、結果を返すメソッド
	public static int calculateSum(int value1, int value2) {
		return value1 + value2;
	}
}