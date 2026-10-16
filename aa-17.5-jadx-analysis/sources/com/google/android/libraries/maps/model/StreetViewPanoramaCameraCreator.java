package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewPanoramaCameraCreator implements Parcelable.Creator<StreetViewPanoramaCamera> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        float fM = BitmapDescriptorFactory.HUE_RED;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                fM = spu.M(parcel, i);
            } else if (c == 3) {
                fM2 = spu.M(parcel, i);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                fM3 = spu.M(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewPanoramaCamera(fM, fM2, fM3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewPanoramaCamera[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
