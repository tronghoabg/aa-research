package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcbk extends AbstractC2614a {
    public static final Parcelable.Creator<zzcbk> CREATOR = new zzcbl();
    public final Bundle zza;
    public final H6.a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfnc zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;

    public zzcbk(Bundle bundle, H6.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfnc zzfncVar, String str4, boolean z2, boolean z10, Bundle bundle2) {
        this.zza = bundle;
        this.zzb = aVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfncVar;
        this.zzj = str4;
        this.zzk = z2;
        this.zzl = z10;
        this.zzm = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        Bundle bundle = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.S(parcel, 1, bundle, false);
        AbstractC1304a.Z(parcel, 2, this.zzb, i5, false);
        AbstractC1304a.Z(parcel, 3, this.zzc, i5, false);
        AbstractC1304a.a0(parcel, 4, this.zzd, false);
        AbstractC1304a.c0(parcel, 5, this.zze);
        AbstractC1304a.Z(parcel, 6, this.zzf, i5, false);
        AbstractC1304a.a0(parcel, 7, this.zzg, false);
        AbstractC1304a.a0(parcel, 9, this.zzh, false);
        AbstractC1304a.Z(parcel, 10, this.zzi, i5, false);
        AbstractC1304a.a0(parcel, 11, this.zzj, false);
        boolean z2 = this.zzk;
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzl;
        AbstractC1304a.k0(parcel, 13, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC1304a.S(parcel, 14, this.zzm, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
