package practice.q02;

public class EmployeeTest {

	public static void main(String[] args) {
		// インスタンス作成
		Employee employee = new Employee();

		//フィールド変数 name, age
		employee.setName("山田");
		employee.setAge(20);

		//出力
		System.out.println("氏名:" + employee.getName());
		System.out.println("年齢:" + employee.getAge());
	}

}
