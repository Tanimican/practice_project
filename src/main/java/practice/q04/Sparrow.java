package practice.q04;

public class Sparrow extends Animal {
	//フィールド変数 canFly
	private boolean canFly;

	//コンストラクタ
	public Sparrow(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	//飛べるかの判定
	public boolean isCanFly() {
		return canFly;
	}

	//canFly
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	//出力
	@Override
	public void showInfo() {
		super.showInfo();
		if (isCanFly()) {
			System.out.println("飛べます");
		} else {
			System.out.println("飛べません");
		}
	}

	//鳴き声
	public void cry() {
		System.out.println("鳴き声:" + "チュンチュン");
	}
}
