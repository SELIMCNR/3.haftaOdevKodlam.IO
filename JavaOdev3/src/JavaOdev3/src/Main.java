package JavaOdev3.src;
public class Main {
    public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		// Customer nesneleri
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Los Angeles";

    /*
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save(customer);
		customerManager.save(customer);
		System.out.println(customer.city);


		customerManager.save();
		customerManager.save();
		customerManager.delete();
		customerManager.delete();
		System.out.println(customer.city);
*/
		Company company = new Company();
		company.id = 5;
		company.taxNumber = "10000";
		company.companyName = "Çınar Market";

		//CustomerManager customerManager2 = new CustomerManager(new Company());

		Person person = new Person();
		person.firstName = "Juliet";
		person.nationalIdentity = "555";


		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.calculate();

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();
        customerManager.save();
    }
}