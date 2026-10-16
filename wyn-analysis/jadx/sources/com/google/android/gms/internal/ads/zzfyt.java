package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzfyt extends AbstractC2614a {
    public static final Parcelable.Creator<zzfyt> CREATOR = new zzfyu();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfyt(int i5, String str, String str2) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.a0(parcel, 3, this.zzc, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzfyt(String str, String str2) {
        this(1, str, str2);
    }
}
