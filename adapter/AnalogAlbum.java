package adapter;

/**
 * Nolan Blevins
 * 
 * Interface for cassett class
 */
public interface AnalogAlbum {
    public String play();

    public String rewind();

    public String ffwd();

    public String pause();

    public String stopEject();
}