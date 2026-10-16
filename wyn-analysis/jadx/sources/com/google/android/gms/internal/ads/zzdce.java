package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzdce {
    private final zzfps zza;
    private final H6.a zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzimt zzg;
    private final String zzh;
    private final zzfcv zzi;
    private final G6.N zzj;
    private final zzflg zzk;
    private final zzdis zzl;

    public zzdce(zzfps zzfpsVar, H6.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzimt zzimtVar, G6.N n10, String str2, zzfcv zzfcvVar, zzflg zzflgVar, zzdis zzdisVar) {
        this.zza = zzfpsVar;
        this.zzb = aVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzimtVar;
        this.zzh = str2;
        this.zzi = zzfcvVar;
        this.zzj = n10;
        this.zzk = zzflgVar;
        this.zzl = zzdisVar;
    }

    public final p8.p zza(Bundle bundle) {
        this.zzl.zza();
        zzfpm zzfpmVar = zzfpm.SIGNALS;
        zzfps zzfpsVar = this.zza;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zza(this.zzi.zza(new Bundle(), bundle), zzfpmVar, zzfpsVar).zzi();
    }

    public final p8.p zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcS)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final p8.p pVarZza = zza(bundle);
        return this.zza.zzb(zzfpm.REQUEST_PARCEL, pVarZza, (p8.p) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(pVarZza, bundle);
            }
        }).zzi();
    }

    public final zzcbk zzc(p8.p pVar, Bundle bundle) {
        Bundle bundle2 = (Bundle) pVar.get();
        String str = (String) ((p8.p) this.zzg.zzb()).get();
        boolean z2 = false;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzid)).booleanValue() && ((G6.O) this.zzj).D()) {
            z2 = true;
        }
        boolean z10 = z2;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzcbk(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z10, this.zzk.zza(), bundle);
    }
}
