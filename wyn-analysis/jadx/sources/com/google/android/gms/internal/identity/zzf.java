package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import d7.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        ArrayList arrayListC = null;
        ClientIdentity clientIdentity = null;
        int iF0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                iF0 = v0.f0(i5, parcel);
            } else if (c10 == 3) {
                strY = v0.y(i5, parcel);
            } else if (c10 == 4) {
                strY2 = v0.y(i5, parcel);
            } else if (c10 == 6) {
                strY3 = v0.y(i5, parcel);
            } else if (c10 == 7) {
                clientIdentity = (ClientIdentity) v0.x(parcel, i5, ClientIdentity.CREATOR);
            } else if (c10 != '\b') {
                v0.m0(i5, parcel);
            } else {
                arrayListC = v0.C(parcel, i5, d.CREATOR);
            }
        }
        v0.D(iO0, parcel);
        return new ClientIdentity(iF0, strY, strY2, strY3, arrayListC, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new ClientIdentity[i5];
    }
}
