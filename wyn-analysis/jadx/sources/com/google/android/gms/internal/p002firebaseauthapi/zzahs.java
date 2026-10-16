package com.google.android.gms.internal.p002firebaseauthapi;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzahs implements Parcelable.Creator<zzahp> {
    @Override // android.os.Parcelable.Creator
    public final zzahp createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        while (parcel.dataPosition() < iO0) {
            v0.m0(parcel.readInt(), parcel);
        }
        v0.D(iO0, parcel);
        return new zzahp();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahp[] newArray(int i5) {
        return new zzahp[i5];
    }
}
