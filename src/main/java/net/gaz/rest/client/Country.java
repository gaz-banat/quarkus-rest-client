package net.gaz.rest.client;
import java.util.List;

public class Country {
    public String name;
    public String alpha2code;
    public String capital;
    public List<Currency> currencies;

    public static class Currency {
        public String code;
        public String name;
        public String symbol;
    }
}
