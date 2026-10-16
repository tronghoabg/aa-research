package com.google.android.gms.internal.measurement;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zzdw extends AbstractC2614a {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdv();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdw(long j8, long j10, boolean z2, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j8;
        this.zzb = j10;
        this.zzc = z2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        long j8 = this.zza;
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(j8);
        long j10 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(j10);
        boolean z2 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.a0(parcel, 4, this.zzd, false);
        AbstractC1304a.a0(parcel, 5, this.zze, false);
        AbstractC1304a.a0(parcel, 6, this.zzf, false);
        AbstractC1304a.S(parcel, 7, this.zzg, false);
        AbstractC1304a.a0(parcel, 8, this.zzh, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
