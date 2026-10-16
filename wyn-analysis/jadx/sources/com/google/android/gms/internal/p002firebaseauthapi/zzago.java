package com.google.android.gms.internal.p002firebaseauthapi;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzago implements Parcelable.Creator<zzagl> {
    @Override // android.os.Parcelable.Creator
    public final zzagl createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        Long lI0 = null;
        String strY3 = null;
        Long lI02 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 2) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 3) {
                strY2 = v0.y(i5, parcel);
            } else if (c10 == 4) {
                lI0 = v0.i0(i5, parcel);
            } else if (c10 == 5) {
                strY3 = v0.y(i5, parcel);
            } else if (c10 != 6) {
                v0.m0(i5, parcel);
            } else {
                lI02 = v0.i0(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzagl(strY, strY2, lI0, strY3, lI02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagl[] newArray(int i5) {
        return new zzagl[i5];
    }
}
