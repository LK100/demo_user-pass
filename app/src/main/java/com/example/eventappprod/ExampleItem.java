package com.example.eventappprod;

import android.media.Image;
import android.net.Uri;

public class ExampleItem {
    //private int mImageResource;
    private Uri mImageResource;
    //private Image mImageResource;
    private String mText1;
    private String mText2;

    public ExampleItem(Uri imageResource, String text1, String text2){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public Uri getImageResource(){
        return mImageResource;
    }

    public String getText1(){
        return mText1;
    }

    public String getText2(){
        return mText2;
    }
}
