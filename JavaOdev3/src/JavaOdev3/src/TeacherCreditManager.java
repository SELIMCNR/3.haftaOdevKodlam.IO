package JavaOdev3.src;
public class TeacherCreditManager extends BaseCreditManager implements CreditService {

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi verildi.");
    }

}