public class Kalkulator {

    int liczba;
    int liczba1;

    public Kalkulator() {
    }

    public void dodaj(int liczba, int liczba1){
        System.out.println(liczba + liczba1);
    }
    public void odejmij(int liczba, int liczba1){
        System.out.println(liczba - liczba1);

    }
    public void mnozenie(int liczba, int liczba1){
        System.out.println(liczba * liczba1);

    }

    public void  dzielenie(int liczba, int liczba1) {
        System.out.println(liczba / liczba1);

    }

    public Kalkulator(int liczba, int liczba1) {
        this.liczba = liczba;
        this.liczba1 = liczba1;

    }
        public void dzialania (){
            System.out.println(liczba + liczba1);
            System.out.println(liczba - liczba1);
            System.out.println(liczba * liczba1);
            System.out.println(liczba / liczba1);
        }


}
