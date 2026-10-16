package com.google.android.gms.internal.ads;

import D6.C0395s;

/* loaded from: classes3.dex */
public final class zzdif implements zzdgf {
    private int zza;
    private int zzb;

    public zzdif() {
        zzbio zzbioVar = zzbix.zzbX;
        C0395s c0395s = C0395s.f2489e;
        this.zza = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        this.zzb = ((Integer) c0395s.f2492c.zzd(zzbix.zzoC)).intValue();
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final synchronized void zzdQ(zzfky zzfkyVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbY)).booleanValue()) {
            try {
                zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
                this.zza = zzfkqVar.zzc;
                this.zzb = zzfkqVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
