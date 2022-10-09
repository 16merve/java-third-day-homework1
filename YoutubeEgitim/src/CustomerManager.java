//KATMANLI MİMARİLER
public class CustomerManager{//ilk önce müşteri ataması yapıp daha sonra mainde çalıştırabiliriz.HATANIN NEDENİ!
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {//parametre
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri Kaydedildi.");
		

	}
	public void Dalete() {
		System.out.println("Müşteri Silindi." );
		

	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}
}
