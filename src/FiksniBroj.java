import java.util.HashMap;


public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad, String broj) {
        grad = grad;
        broj = broj;
    }

    @Override
    public String ispisi() {
        String pozivniBroj = "";
        switch (grad) {
            case SARAJEVO:
                pozivniBroj = "033";
                break;
            case TUZLA:
                pozivniBroj = "035";
                break;
            case ZENICA:
                pozivniBroj = "032";
                break;
            case BRCKO:
                pozivniBroj = "049";
                break;
        }
        return pozivniBroj + "/" + broj;
    }

    @Override
    public int hashCode() {
        return grad.hashCode() + broj.hashCode();
    }
};
