package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;	// seller를 하위 클래스 형은 Customer로 형변환
			customer2.buy();
			customer2.sell();
		}

	}

}
