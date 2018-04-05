package thur.introtoobjects;

/**
 *
 * @author john
 */
public class ThurIntroToObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myOtherBox = new Box(4);
        
        System.out.println(myBox.toString());
        
        System.out.println(myBox.equals(myOtherBox));
        
        myBox.setLength(4);
        
        System.out.println(myBox.equals(myOtherBox));
        
        System.out.println(myBox.getVolume());
        
        myOtherBox.setWidth(4);
        myOtherBox.setLength(1);
        
        System.out.println(myBox.hasSameVolumeAs(myOtherBox));
        
        System.out.println(myBox.getLength());
        
        myBox.setLength(5);
        
        System.out.println(myBox.getLength());
        
        myBox.setLength(Box.MIN_LENGTH);
        
        System.out.println(myBox.getLength());
        
        myBox.setLength((Box.MIN_LENGTH - 1));
        
        System.out.println(myBox.getLength());
    }
    
}
