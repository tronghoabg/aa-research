package com.google.android.gms.appset;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzb implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final zza createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                strY = v0.y(i5, parcel);
            } else if (c10 != 2) {
                v0.m0(i5, parcel);
            } else {
                strY2 = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zza(strY, strY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i5) {
        return new zza[i5];
    }
}
