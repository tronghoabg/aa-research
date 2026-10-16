package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class TileOverlayOptionsCreator implements Parcelable.Creator<TileOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        float fM = 0.0f;
        float fM2 = 0.0f;
        boolean zAf = true;
        boolean zAf2 = false;
        IBinder iBinderS = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iBinderS = spu.S(parcel, i);
            } else if (c == 3) {
                zAf2 = spu.af(parcel, i);
            } else if (c == 4) {
                fM = spu.M(parcel, i);
            } else if (c == 5) {
                zAf = spu.af(parcel, i);
            } else if (c != 6) {
                spu.ae(parcel, i);
            } else {
                fM2 = spu.M(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new TileOverlayOptions(iBinderS, zAf2, fM, zAf, fM2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
