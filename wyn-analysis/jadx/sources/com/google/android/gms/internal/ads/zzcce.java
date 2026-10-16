package com.google.android.gms.internal.ads;

import D6.v1;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzcce implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        v1 v1Var = null;
        String strY = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 2) {
                v1Var = (v1) v0.x(parcel, i5, v1.CREATOR);
            } else if (c10 != 3) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzccd(v1Var, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzccd[i5];
    }
}
