package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbrx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        boolean Z10 = false;
        int iF0 = 0;
        String strY2 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 2) {
                Z10 = v0.Z(i5, parcel);
            } else if (c10 == 3) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 != 4) {
                v0.m0(i5, parcel);
            } else {
                strY2 = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzbrw(strY, Z10, iF0, strY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbrw[i5];
    }
}
