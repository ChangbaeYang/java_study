package interfaceex;

public abstract class Calculator implements Calc {

	@Override	// 상속받아서 구현
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
