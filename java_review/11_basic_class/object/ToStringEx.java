package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	// 생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString() 재정의. toString은 이미 Object에서 정의해둠
	// String, Integer클래스에서 toString은 객체를 재정의 해둠(다른 것도 있는 경우가 있음)
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber; 
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200,  "개미");
		
		System.out.println(book1);	// 인스턴스 정보(클래스 이름, 주소 값)
		System.out.println(book1.toString());	// toString 메서드로 인스턴스 정보를 보여줌
	}
}
