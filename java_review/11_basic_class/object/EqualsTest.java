package object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentZzang = new Student(100, "짱배");
		Student studentZzang2 = studentZzang;	// 주소복사
		Student studentBae = new Student(100, "짱배");
	
	// == : 두 인스턴스가 같은 주소값일 때, true. -> 예상값 : 다름
	if(studentZzang == studentZzang2)
		System.out.println("studentZzang와 studentZzang2의 주소가 같습니다.");
	else
		System.out.println("studentZzang와 studentZzang2의 주소는 다릅니다.");
	
	// equals : 두 인스턴스가 같은 주소값을 가질 때, true(String, Integer처럼 override되지 않음.
	if(studentZzang.equals(studentZzang2))
		System.out.println("studentZzang과 stdudentZzang2이 동일합니다.");
	
	else
		System.out.println("studentZzang과 studentZzang2이 동일하지 않습니다.");
	
	// == : 두 인스턴스의 주소 비교 -> 예상값 : 다름
	if(studentZzang == studentBae)
		System.out.println("studentZzang와 studentBae의 주소가 같습니다.");
	else
		System.out.println("studentZzang와 studentBae의 주소가 다릅니다.");
	
	// equals : 두 인스턴스가 주소값이 같을 때, true -> 예상값 : 동일하지 않음(동일인이지만 주소값이 다름)
	if(studentZzang.equals(studentBae))
		System.out.println("studentZzang과 studentBae이 동일합니다.");
	else
		System.out.println("studentZzang과 studentBae이 동일하지 않습니다.");	
	}
}
