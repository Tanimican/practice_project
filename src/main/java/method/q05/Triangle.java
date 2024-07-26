package method.q05;

public class Triangle {

	public static void main(String[] args) {
		//三角形の底辺 bottom, 三角形の高さ height を宣言
		int bottom = 8;
		int height = 5;
		//引数で三角形の面積を求めて、結果を出力
		System.out.println(String.format("底辺：%d%n高さ：%d%n三角形の面積：%d", bottom, height, getTriangleArea(bottom, height)));
	}

	// 三角形の面積を求め、結果を返すメソッド
	public static int getTriangleArea(int bottom, int height) {
		return (bottom * height) / 2;
	}

}
