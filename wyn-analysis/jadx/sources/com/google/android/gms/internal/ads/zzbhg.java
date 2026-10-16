package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbhg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        boolean Z10 = false;
        boolean Z11 = false;
        boolean Z12 = false;
        long jH0 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) v0.x(parcel, i5, ParcelFileDescriptor.CREATOR);
            } else if (c10 == 3) {
                Z10 = v0.Z(i5, parcel);
            } else if (c10 == 4) {
                Z11 = v0.Z(i5, parcel);
            } else if (c10 == 5) {
                jH0 = v0.h0(i5, parcel);
            } else if (c10 != 6) {
                v0.m0(i5, parcel);
            } else {
                Z12 = v0.Z(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzbhf(parcelFileDescriptor, Z10, Z11, jH0, Z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbhf[i5];
    }
}
