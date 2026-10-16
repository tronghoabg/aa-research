package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class MapStyleOptionsCreator implements Parcelable.Creator<MapStyleOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MapStyleOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        String strX = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                spu.ae(parcel, i);
            } else {
                strX = spu.X(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new MapStyleOptions(strX);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MapStyleOptions[] newArray(int i) {
        return new MapStyleOptions[i];
    }
}
