/***
 * Class for SyntheticFabrics
 * @author Cian McDonald (ID 119363843)
 */
public abstract class SyntheticFabrics extends Fabric{
    
    /**
     * Construct an instance of this class with a given name and price
     * 
     * @param name The proper English name of the Garment.
     * @param price The price of 1 unit of fabric
     */
    public SyntheticFabrics(String name, Double price) {
        super(name, price);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isNatural() {
        return false;
    }
}
