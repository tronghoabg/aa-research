package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class PointOfInterestCreator implements Parcelable.Creator<PointOfInterest> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PointOfInterest createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        LatLng latLng = null;
        String strX = null;
        String strX2 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c == 3) {
                strX = spu.X(parcel, i);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                strX2 = spu.X(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new PointOfInterest(latLng, strX, strX2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PointOfInterest[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
