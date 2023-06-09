package interfaceex;

public class CalaulatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num2));
		
		calc.showInfo();	// CompleteCalc에서 만든 메서드
		calc.description(); // 디폴트 메서드 호출
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));	// 정적 메서드를 사용함-인터페이스를 직접 참조함
	}
}
