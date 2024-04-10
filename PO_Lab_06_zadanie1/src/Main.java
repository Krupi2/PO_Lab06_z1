//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(),
                new Point(2.4,8),
                new Point(-2.5,3)
        };
        //wywołanie metody opis
        for (Point item : points){
            item.opis();
        }
        System.out.println();
        for (Point item : points){
            item.zeruj();
        }
        for (Point item : points){
            item.opis();
        }
        System.out.println();
        for (Point item : points){
            item.przesun(2,3);
        }
        for (Point item : points){
            item.opis();
        }
        System.out.println();

        Figura figura = new Figura();
        figura.opis();

        Prostokat prostokat = new Prostokat(3,4);
        System.out.println("Pole prostokata: "+ prostokat.getPowierzchnia());

        Trojkat trojkat = new Trojkat(23,56);

        prostokat.przesun(3,5);

        Kwadrat kwadrat = new Kwadrat(3);
        System.out.println("Pole powierzchni kwadratu "+kwadrat.getPowierzchnia());

        kwadrat.opis();
        trojkat.opis();
        prostokat.opis();

    }//koniec main
}//koniec klasy