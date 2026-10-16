package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import D6.v1;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbic;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzczq implements zzden, InterfaceC0358a, zzdgf, zzddt, zzdcz, zzdiq {
    private final InterfaceC3596a zza;
    private final zzcfe zzb;

    public zzczq(InterfaceC3596a interfaceC3596a, zzcfe zzcfeVar) {
        this.zza = interfaceC3596a;
        this.zzb = zzcfeVar;
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        InterfaceC3596a interfaceC3596a = this.zza;
        zzcfe zzcfeVar = this.zzb;
        ((C3597b) interfaceC3596a).getClass();
        zzcfeVar.zzd(SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(v1 v1Var) {
        this.zzb.zza(v1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzj(zzbic.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzk(zzbic.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzl(zzbic.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzm(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzn(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
