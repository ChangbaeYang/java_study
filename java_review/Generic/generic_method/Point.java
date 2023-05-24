package generic_method;

// 타입 변수를 T, V 2개를 사용한다.
// 점이 실수일 수도 있고, 정수일 수도 있다.
public class Point<T, V> {
	T x;	// 멤버 변수
	V y;	// 멤버 변수
	
	// 점 생성자
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	// 멤버 함수이자 제너릭 메소드
	public T getX() {
		return x;
	}
	
	// 멤버 함수이자 제너릭 메소드
	public V getY() {
		return y;
	}
}