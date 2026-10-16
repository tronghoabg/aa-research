package com.waze.navigate;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class NearbyStation implements Parcelable {
    public static final Parcelable.Creator<NearbyStation> CREATOR = new c(2);
    public final String address;
    public final String icon;
    public final int index;
    public final String result;
    public final String value;

    private NearbyStation(Parcel parcel) {
        this.result = parcel.readString();
        this.value = parcel.readString();
        this.icon = parcel.readString();
        this.address = parcel.readString();
        this.index = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.result);
        parcel.writeString(this.value);
        parcel.writeString(this.icon);
        parcel.writeString(this.address);
        parcel.writeInt(this.index);
    }

    public NearbyStation(String str, String str2, String str3, String str4, int i2) {
        this.result = str;
        this.value = str2;
        this.icon = str3;
        this.address = str4;
        this.index = i2;
    }

    /* synthetic */ NearbyStation(Parcel parcel, et etVar) {
        this(parcel);
    }
}
