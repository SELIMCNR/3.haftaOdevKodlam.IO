package  JavaOdev3.src;
public class MilitaryCreditManager extends BaseCreditManager implements CreditService {

    @Override
    public void calculate() {
        System.out.println("Asker kredisi verildi");
    }

}