package com.google.android.gms.internal.ads;

import D6.v1;
import D6.x1;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzcey implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        x1 x1Var = null;
        v1 v1Var = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 2) {
                strY2 = v0.y(i5, parcel);
            } else if (c10 == 3) {
                x1Var = (x1) v0.x(parcel, i5, x1.CREATOR);
            } else if (c10 != 4) {
                v0.m0(i5, parcel);
            } else {
                v1Var = (v1) v0.x(parcel, i5, v1.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new zzcex(strY, strY2, x1Var, v1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcex[i5];
    }
}
