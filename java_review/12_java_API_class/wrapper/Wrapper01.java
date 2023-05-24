package wrapper;

public class Wrapper01 {
	public static void main(String[] args) {
		Integer num = new Integer(17);	// 박싱 -> 버전 9부턴 활용X
		int n = num.intValue();			// 언박싱
		System.out.println(n);	// 결과 : 17
		
		Character ch ='X';	// Character ch = new Character('X'); : 오토박싱
		char c = ch;		// char c= ch.charValue(); : 오토언박싱
		System.out.println(c);	// 결과 : X
	}

}
