public class Main {
    public static void main(String[] args) {

        NowaKlasa object = new NowaKlasa();
        object.metoda();
        object.metodaAbstrakcyjna();

        Pies pies = new Pies();
        Kot kot = new Kot();
        Ssak inne = new Pies();

        pies.dzwiek();
        kot.dzwiek();
        inne.dzwiek();
    }
}