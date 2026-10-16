package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzdac implements zzdiu, zzden {
    private final InterfaceC3596a zza;
    private final zzdae zzb;
    private final zzflg zzc;
    private final String zzd;

    public zzdac(InterfaceC3596a interfaceC3596a, zzdae zzdaeVar, zzflg zzflgVar, String str) {
        this.zza = interfaceC3596a;
        this.zzb = zzdaeVar;
        this.zzc = zzflgVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zza() {
        InterfaceC3596a interfaceC3596a = this.zza;
        zzdae zzdaeVar = this.zzb;
        String str = this.zzd;
        ((C3597b) interfaceC3596a).getClass();
        zzdaeVar.zzd(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        InterfaceC3596a interfaceC3596a = this.zza;
        String str = this.zzd;
        ((C3597b) interfaceC3596a).getClass();
        this.zzb.zze(this.zzc.zzg, str, SystemClock.elapsedRealtime());
    }
}
