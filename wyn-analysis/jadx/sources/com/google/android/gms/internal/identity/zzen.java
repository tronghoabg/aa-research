package com.google.android.gms.internal.identity;

import U8.v0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzen implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = "";
        ArrayList arrayListA = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                arrayListA = v0.A(i5, parcel);
            } else if (c10 == 2) {
                pendingIntent = (PendingIntent) v0.x(parcel, i5, PendingIntent.CREATOR);
            } else if (c10 != 3) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzem(arrayListA, pendingIntent, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzem[i5];
    }
}
