package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzcbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            if (((char) i5) != 2) {
                v0.m0(i5, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) v0.x(parcel, i5, ParcelFileDescriptor.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new zzcbi(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcbi[i5];
    }
}
