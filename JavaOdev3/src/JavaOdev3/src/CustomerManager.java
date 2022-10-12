package JavaOdev3.src;
public class CustomerManager {

    private Customer customer;
    private CreditService creditService;


    public CustomerManager(Customer customer, CreditService creditService) {

        this.customer = customer;
        this.creditService = creditService;

    }

    public void save() {

        creditService.save();
        System.out.println("Customer kaydedildi.");
    }

    public void delete() {

        System.out.println("Customer silindi. ");
    }

    public void giveCredit() {

        creditService.calculate();
        System.out.println("Kredi verildi");
    }



}