public enum Pizza {
    MALA(20,33.2f),
    DUZA(32,44.90f),
    XXL(50, 44.01f);

    public int rozmiar;
    public float cena;
    private Pizza (int rozmiar, float cena)
    {
        this.rozmiar = rozmiar;
        this.cena = cena;
    }
}
