package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaOrientationCreator implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        float fM = BitmapDescriptorFactory.HUE_RED;
        float fM2 = 0.0f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                fM = spu.M(parcel, i);
            } else if (c != 3) {
                spu.ae(parcel, i);
            } else {
                fM2 = spu.M(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewPanoramaOrientation(fM, fM2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaOrientation[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
