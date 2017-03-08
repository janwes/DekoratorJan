package dekorator;

public class Dekorator 
{

    public static void main(String[] args) 
    {
        DunkleRöstung dR = new DunkleRöstung("Dunkle Röstung");
        Schoko s = new Schoko("Schoko",dR);
        Soja so = new Soja("Soja", s);
        Milchschaum m = new Milchschaum("Milchschaum", so);
        System.out.println(m.getBeschreibung());
        System.out.println(m.preis());
    }
    
}
