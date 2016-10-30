package se.sugarest.jane.budapest;

/**
 * Created by jane on 16-10-30.
 */

public class Place {

    /**
     * Place name for the place
     */
    private String mPlaceName;

    /**
     * Short description for the place
     */
    private String mShortDescription;

    /**
     * Image Id for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param placeName        is the name of the place
     * @param shortDescription is the short description of the place
     * @param imageResourceId  is the drawable resource ID for the image associated with the place
     */
    public Place(String placeName, String shortDescription, int imageResourceId) {
        mPlaceName = placeName;
        mShortDescription = shortDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * @return the place name of the place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * @return the short description of the place.
     */
    public String getShortDescription() {
        return mShortDescription;
    }

    /**
     * @return the short description of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mPlaceName='" + mPlaceName + '\'' +
                ", mShortDescription='" + mShortDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}


