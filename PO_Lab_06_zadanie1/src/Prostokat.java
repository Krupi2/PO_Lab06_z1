
class Prostokat extends Figura{
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public void przesun(int x, int y){
		this.szer+=x;
		this.wys+=y;
	}
	double getPowierzchnia() {
        return (szer * wys);
    }

	public void opis(){
		System.out.format("Prostokąt o bokach %.2f i %.2f\n", wys, szer);
	}

}