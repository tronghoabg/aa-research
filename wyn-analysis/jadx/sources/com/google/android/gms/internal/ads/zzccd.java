package com.google.android.gms.internal.ads;

import D6.v1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzccd extends AbstractC2614a {
    public static final Parcelable.Creator<zzccd> CREATOR = new zzcce();
    public final v1 zza;
    public final String zzb;

    public zzccd(v1 v1Var, String str) {
        this.zza = v1Var;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v1 v1Var = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 2, v1Var, i5, false);
        AbstractC1304a.a0(parcel, 3, this.zzb, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
