public class MedunarodniBroj : extends TelefonskiBroj{
    private String drzava;
    private String broj;

public MedunarodniBroj(String drzava, String broj) {
        drzava = drzava;
        broj = broj;
        }

@Override
public String ispisi() {
        return drzava + broj;
        }

@Override
public int hashCode() {

        return drzava.hashCode() + broj.hashCode();
        }
        };
