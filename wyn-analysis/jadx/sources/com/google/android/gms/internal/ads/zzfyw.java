package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzfyw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        byte[] bArrR = null;
        int iF0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 != 2) {
                v0.m0(i5, parcel);
            } else {
                bArrR = v0.r(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzfyv(iF0, bArrR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzfyv[i5];
    }
}
