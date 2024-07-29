package practice.q04;

public class Animal {
	//フィールド変数 name, ageを宣言
	private String name;
	private int age;

	//コンストラクタ
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//出力
	public void showInfo() {
		System.out.println("名前:" + getName());
		System.out.println("年齢:" + getAge());
	}
}
