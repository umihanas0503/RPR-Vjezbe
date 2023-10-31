public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;


    public MobilniBroj(int mobilnaMreza, String broj)
    {
        mobilnaMreza=mobilnaMreza;
        broj=broj;

    }
    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return mobilnaMreza + broj.hashCode();
    }
}
};
