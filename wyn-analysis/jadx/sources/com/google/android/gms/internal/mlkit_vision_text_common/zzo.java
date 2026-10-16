package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        while (parcel.dataPosition() < iO0) {
            v0.m0(parcel.readInt(), parcel);
        }
        v0.D(iO0, parcel);
        return new zzn();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzn[i5];
    }
}
