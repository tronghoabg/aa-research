package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class LatLngCreator implements Parcelable.Creator<LatLng> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public LatLng createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        double dL = 0.0d;
        double dL2 = 0.0d;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                dL = spu.L(parcel, i);
            } else if (c != 3) {
                spu.ae(parcel, i);
            } else {
                dL2 = spu.L(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new LatLng(dL, dL2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
