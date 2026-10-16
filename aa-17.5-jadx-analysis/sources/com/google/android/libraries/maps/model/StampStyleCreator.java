package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StampStyleCreator implements Parcelable.Creator<StampStyle> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StampStyle createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        IBinder iBinderS = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                spu.ae(parcel, i);
            } else {
                iBinderS = spu.S(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StampStyle(iBinderS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StampStyle[] newArray(int i) {
        return new StampStyle[i];
    }
}
