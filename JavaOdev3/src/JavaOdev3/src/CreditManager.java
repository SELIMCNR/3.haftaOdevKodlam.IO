package JavaOdev3.src;

public class CreditManager implements CreditService {

    @Override
    public void calculate() {
        System.out.println("Hesapland─▒");
    }

    @Override
    public void save() {
        System.out.println("Kredi verildi.");

    }

}