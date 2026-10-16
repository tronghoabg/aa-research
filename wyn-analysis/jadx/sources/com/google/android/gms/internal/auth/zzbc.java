package com.google.android.gms.internal.auth;

import U8.v0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        int iF0 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 == 2) {
                strY = v0.y(i5, parcel);
            } else if (c10 != 3) {
                v0.m0(i5, parcel);
            } else {
                pendingIntent = (PendingIntent) v0.x(parcel, i5, PendingIntent.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new zzbb(iF0, strY, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbb[i5];
    }
}
