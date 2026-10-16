package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class CameraPositionCreator implements Parcelable.Creator<CameraPosition> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CameraPosition createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        float fM = BitmapDescriptorFactory.HUE_RED;
        float fM2 = 0.0f;
        LatLng latLng = null;
        float fM3 = 0.0f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
            } else if (c == 3) {
                fM = spu.M(parcel, i);
            } else if (c == 4) {
                fM3 = spu.M(parcel, i);
            } else if (c != 5) {
                spu.ae(parcel, i);
            } else {
                fM2 = spu.M(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new CameraPosition(latLng, fM, fM3, fM2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
