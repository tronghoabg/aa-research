package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            if (((char) i5) != 2) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzp(strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzp[i5];
    }
}
