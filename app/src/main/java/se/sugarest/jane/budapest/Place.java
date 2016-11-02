package se.sugarest.jane.budapest;

/**
 * Created by jane on 16-10-30.
 */

public class Place {

    /**
     * Name string resource Id for the place
     */
    private int mPlaceName;

    /**
     * Short description string resource Id for the place
     */
    private int mShortDescription;

    /**
     * Home page or Wikipedia Link of the place
     */
    private String mWebsite;

    /**
     * Image Id for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param placeName        is the string Id for the name of the place
     * @param shortDescription is the string Id for the short description of the place
     * @param website          is the website of the place
     * @param imageResourceId  is the drawable resource ID for the image associated with the place
     */
    public Place(int placeName, int shortDescription, String website, int imageResourceId) {
        mPlaceName = placeName;
        mShortDescription = shortDescription;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     * @return the string Id for the name of the place.
     */
    public int getPlaceName() {
        return mPlaceName;
    }

    /**
     * @return the string Id for the short description of the place.
     */
    public int getShortDescription() {
        return mShortDescription;
    }

    /**
     * @return website of the place.
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * @return the drawable resource ID for the image associated with the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}


