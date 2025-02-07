public class Okrag extends Figura{
    Point srodekOkregu;
    double r;

    public double getPowierzchnia(){return Math.PI*Math.pow(r,2);}

    public double srednica(){return 2*r;}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void wSrodku(Point p){
        double lewaStrona = Math.pow((p.x - srodekOkregu.x),2)+Math.pow((p.y-srodekOkregu.y),2);
        double prawaStrona = Math.pow(r,2);
        if (lewaStrona<=prawaStrona){
            System.out.format("\nPunkt o współrzędnych (%.2f,%.2f), " +
                    "znajduje sie w srodku okregu S = (%.2f,%.2f)", p.x, p.y, srodekOkregu.x, srodekOkregu.y);
        }
        else {
            System.out.println("Punkt lezy poza okregiem");
        }
    }

    public Okrag() {
        this.srodekOkregu.x = 0.0;
        this.srodekOkregu.y = 0.0;
        this.r = 0.0;
    }

    public Okrag(Point srodekOkregu, double r) {
        this.srodekOkregu = srodekOkregu;
        this.r = r;
    }

    public void opis(){
        System.out.format("Okrąg o środku w (%.2f,%.2f) i promieniu %.2f\n", srodekOkregu.x, srodekOkregu.y, r);
    }
}//koniec klasy
