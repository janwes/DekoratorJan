package dekorator;

public abstract class ZutatDekorierer extends Getränk
{
    private Getränk getränk;
    private String beschreibung;
    
    public ZutatDekorierer(String beschreib, Getränk g) {
        super(beschreib);
        getränk = g;
        beschreibung = beschreib;
    }

    public Getränk getGetränk()
    {
        return getränk;
    }
    public String getBeschreibung()
    {
        return  getränk.getBeschreibung() + " mit " + beschreibung ;
    }
}
