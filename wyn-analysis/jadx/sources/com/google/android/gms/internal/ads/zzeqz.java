package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeqz implements zzdei {
    boolean zza;
    final /* synthetic */ zzemd zzb;
    final /* synthetic */ zzcgd zzc;

    public zzeqz(zzerc zzercVar, zzemd zzemdVar, zzcgd zzcgdVar) {
        this.zzb = zzemdVar;
        this.zzc = zzcgdVar;
        Objects.requireNonNull(zzercVar);
        this.zza = false;
    }

    private final synchronized void zze(K0 k02) {
        int i5 = 1;
        if (true == ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgF)).booleanValue()) {
            i5 = 3;
        }
        this.zzc.zzd(new zzeme(i5, k02));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzb(int i5) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new K0(i5, zzerc.zze(this.zzb.zza, i5), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzc(int i5, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzerc.zze(this.zzb.zza, i5);
            }
            zze(new K0(i5, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzd(K0 k02) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(k02);
    }
}
