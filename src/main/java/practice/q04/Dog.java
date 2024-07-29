package practice.q04;

public class Dog extends Animal {
	//フィールド変数 furColor を宣言
	private String furColor;

	//コンストラクタ
	public Dog(String name, int age, String furcolor) {
		super(name, age);
		this.furColor = furcolor;
	}

	//furcolor
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	//出力
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色:" + getFurColor());
	}

	//鳴き声
	public void cry() {
		System.out.println("鳴き声:" + "ワン");
	}
}
