package com.waze.main.navigate;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class LocationData implements Serializable {
    private static final long serialVersionUID = 1;
    public String destinationName;
    public String downloadUrl;
    public String emailLocationUrlPrefix;
    public String locationEta;
    public String locationHash;
    public String locationName;
    public int locationX;
    public int locationY;
    public String mCity;
    public String mStreet;
    public String mVenueId;
    public String smsLocationUrlPrefix;

    public LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, String str9, String str10) {
        this.locationName = str;
        this.destinationName = str2;
        this.locationEta = str3;
        this.smsLocationUrlPrefix = str4;
        this.emailLocationUrlPrefix = str5;
        this.downloadUrl = str6;
        this.locationHash = str7;
        this.locationX = i2;
        this.locationY = i3;
        this.mCity = str8;
        this.mStreet = str9;
        this.mVenueId = str10;
    }

    public LocationData() {
        this.mCity = null;
        this.mStreet = null;
    }

    public LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.mCity = null;
        this.mStreet = null;
        this.locationName = str;
        this.destinationName = str2;
        this.locationEta = str3;
        this.smsLocationUrlPrefix = str4;
        this.emailLocationUrlPrefix = str5;
        this.downloadUrl = str6;
        this.locationHash = str7;
        this.mVenueId = str8;
    }
}
