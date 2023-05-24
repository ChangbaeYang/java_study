package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String justStr = new String("Hi!");
		System.out.println("justStr 문자열 주소 : " + System.identityHashCode(justStr));
		
		StringBuilder buffer = new StringBuilder(justStr);	// String으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" this ");
		buffer.append(" is ");
		buffer.append("zzangbae!");
		System.out.println("연산 후 buffer 주소 : " + System.identityHashCode(buffer));
		
		justStr = buffer.toString(); // StringBuilder을 다시 String클래스로 변환하고 넣기
		System.out.println(justStr);
		System.out.println("바뀐 justStr 문자열 주소 : " + System.identityHashCode(justStr));
	}
}
