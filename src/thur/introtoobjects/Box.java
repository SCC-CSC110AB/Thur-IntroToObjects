package thur.introtoobjects;

/**
 *
 * @author john
 */
public class Box {
    public static final int MIN_LENGTH = 1;
    public static final int MIN_WIDTH = 1;
    public static final int MIN_HEIGHT = 1;
    
    private int length;
    private int width;
    private int height;
    
    public Box() {
        this.length = MIN_LENGTH;
        this.width = MIN_WIDTH;
        this.height = MIN_HEIGHT;
    }
    
    public Box(int length) {
        if (length >= MIN_LENGTH) {
            this.length = length;
        } else {
            this.length = MIN_LENGTH;
        }
        this.width = MIN_WIDTH;
        this.height = MIN_HEIGHT;
    }
    
    public boolean equals(Box otherBox) {
        if (this.length == otherBox.length
            && this.width == otherBox.width
            && this.height == otherBox.height) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return this.length + "x" + this.width + "x" + this.height;
    }
    
    public int getVolume() {
        return this.length * this.width * this.height;
    }
    
    public boolean hasSameVolumeAs(Box otherBox) {
        return this.getVolume() == otherBox.getVolume();
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        if (length >= MIN_LENGTH) {
            this.length = length;
        } else {
            System.out.println(
                length
                + " is below the minimum length which is "
                + MIN_LENGTH
            );
        }
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(int width) {
        if (width >= MIN_WIDTH) {
            this.width = width;
        } else {
            System.out.println(
                width
                + " is below the minimum width which is "
                + MIN_WIDTH
            );
            
        }
    }
}
