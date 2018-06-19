package com.example.android.miwok;

import android.media.Image;

public class Word {

    private int mMiwokTranslationId;
    private int mDefaultTranslationId;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int defaultTranslation, int miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslation;
        mMiwokTranslationId = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public Word(int defaultTranslation, int miwokTranslation, int audioResourceId) {
        mDefaultTranslationId = defaultTranslation;
        mMiwokTranslationId = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
