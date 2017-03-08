package dekorator;


public class Schoko extends ZutatDekorierer
{

    public Schoko(String beschreib, Getränk g) {
        super(beschreib, g);
    }


    
    public double preis()
    {
        return 0.20 + getGetränk().preis();
    }
}