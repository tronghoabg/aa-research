package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class FollowMyLocationOptionsCreator implements Parcelable.Creator<FollowMyLocationOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FollowMyLocationOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        Float fU = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                spu.ae(parcel, i);
            } else {
                fU = spu.U(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new FollowMyLocationOptions(fU);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public FollowMyLocationOptions[] newArray(int i) {
        return new FollowMyLocationOptions[i];
    }
}
