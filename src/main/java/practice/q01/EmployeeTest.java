package practice.q01;

public class EmployeeTest {
	public static void main(String[] ages) {
		//インスタンス作成
		Employee e1 = new Employee();

		//フィールド変数 name, age に氏名と年齢を代入
		e1.name = "山田";
		e1.age = 20;

		//インスタンス作成
		Employee e2 = new Employee();

		//フィールド変数 name, age に氏名と年齢を代入
		e2.name = "鈴木";
		e2.age = 30;

		//出力
		e1.showInfo();
		System.out.println("-------------");
		e2.showInfo();
	}

}
