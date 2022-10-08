
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		customer.setCity("İstanbul");
		
		Company company = new Company();
		company.setCity("İstanbul");
		
		Person person = new Person();
		person.LastName="Şengül";
		person.Id=1;
		
		CustomerManager customerManager = new CustomerManager(new Company(), new TeacherCreditManager());
		customerManager.GiveCredit();

	}

}
