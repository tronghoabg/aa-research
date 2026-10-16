package com.google.android.gms.internal.identity;

import U8.v0;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzef implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        IBinder iBinderE0 = null;
        IBinder iBinderE02 = null;
        PendingIntent pendingIntent = null;
        String strY = null;
        int iF0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 == 2) {
                iBinderE0 = v0.e0(i5, parcel);
            } else if (c10 == 3) {
                iBinderE02 = v0.e0(i5, parcel);
            } else if (c10 == 4) {
                pendingIntent = (PendingIntent) v0.x(parcel, i5, PendingIntent.CREATOR);
            } else if (c10 != 6) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzee(iF0, iBinderE0, iBinderE02, pendingIntent, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzee[i5];
    }
}
