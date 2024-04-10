
class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	public void opis(){
		System.out.format("Trójkąt o wysokości %.2f i podstawie %.2f\n", wys, podst);
	}
}