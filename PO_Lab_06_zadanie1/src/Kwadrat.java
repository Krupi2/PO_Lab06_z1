public class Kwadrat extends Prostokat{
    double a;

    public Kwadrat(double bok) {
        super(bok, bok);
        this.a=bok;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void opis(){
        System.out.format("Kwadrat o boku %.2f\n", a);
    }
}
