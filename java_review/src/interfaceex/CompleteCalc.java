package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	@Override
	public double square(int num) {
		return Calc.PI * num * num;
	}
	
	// CompleteCalc에서 추가로 구현한 메서드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("정수 계산기가 재정의 됩니다.");
	}
}
