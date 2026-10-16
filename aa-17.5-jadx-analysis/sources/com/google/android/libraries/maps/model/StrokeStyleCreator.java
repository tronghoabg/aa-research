package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StrokeStyleCreator implements Parcelable.Creator<StrokeStyle> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StrokeStyle createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        StampStyle stampStyle = null;
        int iN = 0;
        int iN2 = 0;
        boolean zAf = false;
        float fM = 0.0f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                fM = spu.M(parcel, i);
            } else if (c == 3) {
                iN = spu.N(parcel, i);
            } else if (c == 4) {
                iN2 = spu.N(parcel, i);
            } else if (c == 5) {
                zAf = spu.af(parcel, i);
            } else if (c != 6) {
                spu.ae(parcel, i);
            } else {
                stampStyle = (StampStyle) spu.T(parcel, i, StampStyle.CREATOR);
            }
        }
        spu.ac(parcel, iP);
        return new StrokeStyle(fM, iN, iN2, zAf, stampStyle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StrokeStyle[] newArray(int i) {
        return new StrokeStyle[i];
    }
}
