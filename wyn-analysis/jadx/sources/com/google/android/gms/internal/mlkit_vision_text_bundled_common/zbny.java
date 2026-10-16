package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zbny implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        long jH0 = 0;
        int iF0 = 0;
        int iF02 = 0;
        int iF03 = 0;
        int iF04 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 == 2) {
                iF02 = v0.f0(i5, parcel);
            } else if (c10 == 3) {
                iF03 = v0.f0(i5, parcel);
            } else if (c10 == 4) {
                iF04 = v0.f0(i5, parcel);
            } else if (c10 != 5) {
                v0.m0(i5, parcel);
            } else {
                jH0 = v0.h0(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zbnx(iF0, iF02, iF03, iF04, jH0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zbnx[i5];
    }
}
