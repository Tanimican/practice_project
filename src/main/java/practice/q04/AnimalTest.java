package practice.q04;

public class AnimalTest {

	public static void main(String[] args) {
		//インスタンス作成
		Dog dog = new Dog("ポチ", 2, "白");

		//詳細
		dog.showInfo();
		dog.cry();

		System.out.println("------------------");

		//インスタンス作成
		Sparrow sparrow = new Sparrow("チュン", 1, true);

		//詳細、鳴き声を出力
		sparrow.showInfo();
		sparrow.cry();
	}

}
