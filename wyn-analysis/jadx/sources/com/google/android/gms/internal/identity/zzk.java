package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        zzh zzhVar = null;
        IBinder iBinderE0 = null;
        IBinder iBinderE02 = null;
        int iF0 = 1;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 == 2) {
                zzhVar = (zzh) v0.x(parcel, i5, zzh.CREATOR);
            } else if (c10 == 3) {
                iBinderE0 = v0.e0(i5, parcel);
            } else if (c10 != 4) {
                v0.m0(i5, parcel);
            } else {
                iBinderE02 = v0.e0(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzj(iF0, zzhVar, iBinderE0, iBinderE02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzj[i5];
    }
}
