package rihoo.tourguideapp;

/**
 * {@link Location} is used to store basic information about different locations.
 * The following information can be stored in this object: name, address, phone number, image ID.
 */
public class Location {
    // Constants
    private static final int NO_IMAGE = -1;

    // Variables
    private String name;
    private String address;
    private String phone;
    private int imageResourceId = NO_IMAGE;

    /**
     * Constructor Location object.
     *
     * @param name    of the location
     * @param address of the location
     * @param phone   number of the location
     */
    public Location(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Constructor for Location object with image.
     *
     * @param name            of the location
     * @param address         of the location
     * @param phone           number of the location
     * @param imageResourceId image of the location
     */
    public Location(String name, String address, String phone, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Get the location's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the location's address.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Get the location's phone number.
     */
    public String getPhoneNumber() {
        return this.phone;
    }

    /**
     * Get the location's image resource ID.
     */
    public int getImageResourceId() {
        return this.imageResourceId;
    }

    /**
     * Check whether the location has an image.
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE;
    }
}
