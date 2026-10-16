package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbsj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = 0;
        int iF02 = 0;
        String strY = null;
        int iF03 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF03 = v0.f0(i5, parcel);
            } else if (c10 == 2) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 3) {
                iF02 = v0.f0(i5, parcel);
            } else if (c10 != 1000) {
                v0.m0(i5, parcel);
            } else {
                iF0 = v0.f0(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzbsi(iF0, iF03, strY, iF02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbsi[i5];
    }
}
