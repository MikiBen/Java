package Samsung;

public abstract class TVSamsung implements TV {

    private boolean stan = false;
    private int numerKanalu = 1;

    @Override
    public void wylacz() {
        stan = false;
        System.out.println("Samsung wylaczony: ");
    }

    @Override
    public void wlacz() {
        stan = true;
        System.out.println("Samsung wlaczony: ");
        wyswietlObraz();
    }

    @Override
    public void zmienPorgrma(int numer) {
        numerKanalu = numer;
        wyswietlObraz();
    }

    private void wyswietlObraz() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (stan) {
                    System.out.println("Wyswietl kanal: " + numerKanalu);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    public void przelacz(int numer) {
        numerKanalu = numer;
    }
}
