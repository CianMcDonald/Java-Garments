/***
 * Class for Cotton
 * @author Cian McDonald (ID 119363843)
 */
public class Cotton extends NaturalFabrics {
    private static String NAME = "Cotton";
    private static Double PRICE = 2.0;
    private static String SOURCE = "Gossypium";

     /**
     * Construct an instance of this class with a given name, price and source
     */
    public Cotton() {
        super(NAME, PRICE, SOURCE);    
    }
}
