/***
 * Class for WinterCoat
 * @author Cian McDonald (ID 119363843)
 */
public class WinterCoat extends Coats {
    private static String NAME = "wintercoat";
    private static Fabric FABRIC_TYPE = new Polyster();
    private static Double FABRIC_UNITS = 2.5;

    
    /**
     * Construct an instance of this class with a given fabric and number of fabric units used 
 */
    public WinterCoat () {
        super(NAME, FABRIC_TYPE, FABRIC_UNITS);
    }
}
