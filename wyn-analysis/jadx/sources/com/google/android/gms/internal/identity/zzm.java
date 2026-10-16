package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        Status status = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            if (((char) i5) != 1) {
                v0.m0(i5, parcel);
            } else {
                status = (Status) v0.x(parcel, i5, Status.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new zzl(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzl[i5];
    }
}
