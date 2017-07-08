package com.example.android.brnotourguide;

/**
 * Created by jansplichal on 06.07.17.
 */

public class Place {

    //string resource for place name
    private int mPlaceNameId;

    //string resource for place address
    private int mPlaceAdressId;

    //string resource for place name
    private int mPlaceHoursId;

    //string resource for place name
    private int mPlaceDesriptionId;

    //resource for image
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     */

    public Place(int placeNameId, int placeAdressId, int placeHoursId, int placeDescriptionId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceAdressId = placeAdressId;
        mPlaceHoursId = placeHoursId;
        mPlaceDesriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;
    }

    //get the string for place name
    public int getplaceNameId() {
        return mPlaceNameId;
    }

    //get the string for place address
    public int getplaceAdressId() {
        return mPlaceAdressId;
    }

    //get the string for place hours
    public int getplaceHoursId() {
        return mPlaceHoursId;
    }

    //get the string for place description
    public int getplaceDescriptionId() {
        return mPlaceDesriptionId;
    }

    //get the string for place image
    public int getimageResourceId() {
        return mImageResourceId;
    }

}