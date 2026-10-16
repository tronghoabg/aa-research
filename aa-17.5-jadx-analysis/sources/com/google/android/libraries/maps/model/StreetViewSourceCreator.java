package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class StreetViewSourceCreator implements Parcelable.Creator<StreetViewSource> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewSource createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        int iN = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                spu.ae(parcel, i);
            } else {
                iN = spu.N(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new StreetViewSource(iN);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public StreetViewSource[] newArray(int i) {
        return new StreetViewSource[i];
    }
}
