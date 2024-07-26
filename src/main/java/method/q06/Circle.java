package method.q06;

public class Circle {

	public static void main(String[] ages) {
		//円の面積 circleArea 宣言
		double circleArea = 5.0;
		//円の面積を求める　結果出力
		System.out.println(String.format("半径:%1.1f%n円の面積:%1.1f", circleArea, getCircleArea(circleArea)));
	}

	//面積を求め、結果を返すメソッド
	public static double getCircleArea(double circleArea) {
		return circleArea * circleArea * Math.PI;
	}
}
