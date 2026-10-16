package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class VisibleRegionCreator implements Parcelable.Creator<VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public VisibleRegion createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c == 3) {
                latLng2 = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c == 4) {
                latLng3 = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c == 5) {
                latLng4 = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c != 6) {
                spu.ae(parcel, i);
            } else {
                latLngBounds = (LatLngBounds) spu.T(parcel, i, LatLngBounds.CREATOR);
            }
        }
        spu.ac(parcel, iP);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
