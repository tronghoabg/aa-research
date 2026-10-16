package com.google.android.gms.internal.ads;

import D6.v1;
import D6.x1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzcex extends AbstractC2614a {
    public static final Parcelable.Creator<zzcex> CREATOR = new zzcey();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final x1 zzc;
    public final v1 zzd;

    public zzcex(String str, String str2, x1 x1Var, v1 v1Var) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = x1Var;
        this.zzd = v1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.a0(parcel, 2, this.zzb, false);
        AbstractC1304a.Z(parcel, 3, this.zzc, i5, false);
        AbstractC1304a.Z(parcel, 4, this.zzd, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
