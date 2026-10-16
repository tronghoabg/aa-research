package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class CustomPromptSet {
    public static final int STATE_DOWNLOADING = 1;
    public static final int STATE_NOT_DOWNLOADED = 2;
    public static final int STATE_READY = 0;
    private boolean mIsOwner;
    private boolean mIsUploaded;
    private String mName;
    private int mState;
    private String mUUID;

    public CustomPromptSet(String str, String str2, boolean z, boolean z2, int i2) {
        this.mUUID = str;
        this.mName = str2;
        this.mIsOwner = z;
        this.mIsUploaded = z2;
        this.mState = i2;
    }

    public String getName() {
        return this.mName;
    }

    public int getState() {
        return this.mState;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public boolean isOwner() {
        return this.mIsOwner;
    }

    public boolean isUploaded() {
        return this.mIsUploaded;
    }
}
