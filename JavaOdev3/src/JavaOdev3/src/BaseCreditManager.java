package JavaOdev3.src;
abstract class BaseCreditManager implements CreditService {

    // may differ within classes.
    public abstract void calculate();

    public void save() {
        System.out.println("Kaydedildi");
    }
}
