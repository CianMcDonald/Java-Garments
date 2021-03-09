import java.util.List;
import java.util.ArrayList;

public class Main {
    
    /** 
     * @param args
     */
    public static void main( final String[] args ) {
        final List<Garment> items = new ArrayList<Garment>( );
        items.add(new Jeans());
        items.add(new TShirt());
        items.add(new RainCoat());
        items.add(new Jacket());
        items.add(new WinterCoat());

        for (Garment item : items) {
            item.printPurpose( );
        }

        System.out.println( );

        for (Garment item : items) {
            item.printItemisedBill( );
            System.out.println();
        }
    }
}
