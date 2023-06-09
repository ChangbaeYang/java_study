package interfaceex;

public interface Calc {
	// 인터페이스에서 선언된 변수 -> 컴파일 과정에서 상수로 변환
	// public static final을 쓰지 않아도 무조건 상수로 인식
	double PI = 3.14;
	int ERROR = -99999999;
	
	// 인터페이스에서 선언한 메서드 -> 컴파일 과정에서 추상 메서드로 변환
	// public abstract를 쓰지 않아도 추상 메서드로 인식
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	double square(int num);
	
	// 디폴트 메서드(기본 제공 메서드, 구현 클래스들 모두 같은 메서드를 지닐 수 있다.)
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	// 정적 메서드
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}	
		myStaticMethod();
		return total;
	}
	
	// private method
	private void myMethod() {
		System.out.println("private 메서드 등장");
	}
	
	// private static method
	private static void myStaticMethod() {
		System.out.println("private static 메서드 등장");
	}
}
